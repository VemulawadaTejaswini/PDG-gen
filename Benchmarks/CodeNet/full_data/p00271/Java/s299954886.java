//問２　2717 佐久間 翼
import java.util.Scanner;
public class Main{
    
    public void solve(){
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        for(int cnt=0;cnt<=7;cnt++){
            a=sc.nextInt();
            b=sc.nextInt();
            System.out.println(a-b);
        }
            }
    
    public static void main(String[]args){
        Main obj = new Main();
        obj.solve();
    }
}