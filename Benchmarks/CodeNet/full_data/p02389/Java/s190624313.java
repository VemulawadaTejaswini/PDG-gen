import java.util.Scanner;
public class Main{
     
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int a,b;
        a = sc.nextInt();
        b = sc.nextInt();
         
        System.out.println((a*b)+" "+(a*2+b*2));
         
    }
     
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}