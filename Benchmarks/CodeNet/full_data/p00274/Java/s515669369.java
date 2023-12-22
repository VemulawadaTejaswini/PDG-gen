//問4 2717 佐久間　翼
import java.util.Scanner;
public class Main{
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int hoz=1;
        int ichi=0;
        while(N!=0){
            for(int cnt=0;cnt<N;cnt++){
                int k=sc.nextInt();
                if(k>=2){
                    hoz++;
                }else if(k==1){
                    ichi++;
                }
            }
            if(hoz>=2){
                System.out.println(hoz+ichi);
            }else{
                System.out.println("NA");
            }
            hoz=1;
            ichi=0;
            N=sc.nextInt();
        }
    }
    public static void main(String[]args){
        Main obj = new Main();
        obj.solve();
    }
}