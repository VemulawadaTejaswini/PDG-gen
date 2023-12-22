//2714　加藤聖弥 問2
import java.util.Scanner;
public class Main{
    int [] seki={0,6000,4000,3000,2000};
    int t;
    int n;
    int k;
    int kin;
    
    public void solve(){
        Scanner sc=new Scanner(System.in);
        k=0;
        while(k<4){
            t=sc.nextInt();
            n=sc.nextInt();
        kin =seki[t]*n;
        System.out.println(kin);
        k+=1;
        }
    }
    
    public static void main(String[] args){
        Main obj=new Main();
        obj.solve();
    }
}