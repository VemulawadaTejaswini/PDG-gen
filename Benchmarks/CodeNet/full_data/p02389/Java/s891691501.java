import java.util.Scanner;

public class Main{
    public void solve(){
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.print(a*b+" ");
        System.out.print(a*2 + b*2);
    }
    
    public static void main(String args[]){
        Main obj = new Main();
        obj.solve();
    }
}