import java.util.Scanner;

public class Main{
    public void solve(){
        Scanner sc =new Scanner(System.in);
        int N,su;
        int one = 0;
        int some = 1;
        N = sc.nextInt();
        
        while(N != 0){
            for(int i=0;i<N;i++){
                su = sc.nextInt();
                if(su <= 1){
                    one++;
                }else{
                    some++;
                }
            }
            if(some >= 2){
                System.out.println(one+some);
            }else{
                System.out.println("NA");
            }
            int one = 0;
            int some = 1;
            N = sc.nextInt();
        }
    }
    
    public static void main(String[]args){
        Main obj = new Main();
        obj.solve();
    }
}