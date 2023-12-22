//2714 ???????????\ 1b
import java.util.Scanner;
public class Main{
    int zyo=0;
    
    public void solve(){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        zyo=x*x*x;
        System.out.println(zyo);
    }
    
    public static void main(String[] args){
        Main obj=new Main();
        obj.solve();
    }
}