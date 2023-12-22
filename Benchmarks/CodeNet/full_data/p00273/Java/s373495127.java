//2718 佐々木 稜平 問3
import java.util.Scanner;
public class Main{
   
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        for(int cnt=0;cnt<N;cnt++){
            int x =sc.nextInt();
            int y =sc.nextInt();
            int b =sc.nextInt();
            int p =sc.nextInt();
            int gokei = x*b+y*p;
            if(b<5){
                b=5;
            }
            if(p<2){
                p=2;
            }
            int waribiki =(x*b+y*p)*8/10;
            if(gokei<=waribiki){
            System.out.println(gokei);
            }else{
                System.out.println(waribiki);
            }
        }
    }
    public static void main(String[] args){
       Main obj = new Main();
       obj.solve();
    }
}