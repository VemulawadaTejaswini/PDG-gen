//2734　吉原直樹　問0278
import java.util.Scanner;
public class Main{
    int n;
    int x;
    int y;
    int b;
    int p;
    int kin;
    int wari;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int k=0;k<n;k++){
            x = sc.nextInt();
            y = sc.nextInt();
            b = sc.nextInt();
            p = sc.nextInt();
            kin = x * b + y * p;
            if(b>=5 && p>=2){
               kin = (x * b + y * p) * 4 / 5;
            } else {
                if(b<5) {
                    b=5;
                }
                if(p<2){
                    p=2;
                }
                wari = (x * b + y * p) * 4 / 5;
                if(kin>wari){
                kin=wari;
                }
         }
        System.out.println(kin);
     }
    }
    
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}