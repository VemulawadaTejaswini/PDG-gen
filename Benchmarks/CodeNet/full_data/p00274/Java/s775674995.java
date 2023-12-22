import java.util.Scanner;
public class Main{
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int N,k;
        int a=0;
        int b=1;
        N=sc.nextInt(); 
      
        while(N!=0){ 
            for(int i=0;i<N;i++){
                k=sc.nextInt();
                if(k>=2){
                    b++;
                }else if(k==1){
                    a++;
                }
            }
            if(b>=2){
                System.out.println(a+b);
            }else{     
                System.out.println("NA");
            }
            a=0;
            b=1;
            N=sc.nextInt();
        }
    }
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}