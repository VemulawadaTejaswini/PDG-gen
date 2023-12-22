import java.util.Scanner;
public class Main{
    static Scanner sc=new Scanner(System.in);
    static Main app=new Main();
    void sub(int ans){    
        System.out.println(ansd(ans)+" "+ansu(ans));    
    }
    public static int ansd(int temp){
        int ans=0;
        for(int i=2;i<temp;i++){
            boolean judge=true;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    judge=false;
                    break;
                }
            }if(judge) ans=i;
        }
        return ans;
    }
    public static int ansu(int temp){
        boolean finish=true;
        temp++;
        while(finish){
            boolean judge=true;
            for(int i=2;i<temp;i++){
                if(temp%i==0){
                    judge=false;
                    break;
                }
            }
            if(judge){
                finish=false;
            }else{
                temp++;
            }
        }
        return temp;
    }
    public static void main(String[] args) {
        while(sc.hasNextInt())app.sub(sc.nextInt());
    }
}