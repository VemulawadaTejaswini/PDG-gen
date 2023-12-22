import java.util.Scanner;
public class Main{
    int x;
    int y;
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
        x=sc.nextInt();
        y=sc.nextInt();
        System.out.print(x*y);
        System.out.print("???");
        System.out.println(2*x+2*y);
    }
    
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}