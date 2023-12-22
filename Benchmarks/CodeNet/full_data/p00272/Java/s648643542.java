//2734　吉原直樹　問0277
import java.util.Scanner;
public class Main{
    int kind;
    int su;
    int kei;
    int []seki = {6000,4000,3000,2000};
    public void solve(){
        Scanner sc = new Scanner(System.in);
        for(int k=0;k<4;k++){
            kind=sc.nextInt();
            switch(kind){
                case 1:
                kind=6000;
                break;
                case 2:
                kind=4000;
                break;
                case 3:
                kind=3000;
                break;
                case 4:
                kind=2000;
                break;
            }
            su=sc.nextInt();
            kei=kind*su;
            System.out.println(kei);
        }
    }
    
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}