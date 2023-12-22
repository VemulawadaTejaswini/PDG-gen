import java.util.Scanner;
 
public class Main{
	static Scanner sc = new Scanner(System.in);
	static int[] prin = new int[52365];
    
    static void SystemOut(){
    	while(sc.hasNext()){
            int n=sc.nextInt();
            if(n==0){
                break;
            }
            int ans=2;
            for(int i = 1;i < 52365;i++){
                if(prin[i] == 0)continue;
                if(n<2)break;
                ans+=(2*i+1);
                n--;
            }
            System.out.println(ans);
        }
    }
   
    void sub(){
        for(int i = 0;i < 52365;i++){
            prin[i]=1;
        }
        int temp1=3;
        while(true){
            if(temp1*temp1>104730){
                break;
            }else{
                if(prin[(temp1-1)/2] == 0){
                    temp1 += 2;
                }else{
                    int temp2 = temp1*temp1;
                    while(temp2 < 104730){
                        prin[(temp2-1)/2] = 0;
                        temp2 += 2*temp1;
                    }
                    temp1 += 2;
                }
            }
        }
        SystemOut();
   }
    
    public static void main(String[] args){
    	Main app=new Main();
    	app.sub();
       
    }
}