import java.util.Scanner;
public class Main{
     
    public void solve(){
        Scanner sc =new Scanner(System.in);
        int S = sc.nextInt();
        int h = S/3600;
        int m = (S-h*3600)/60;
        int s = S - h*3600 - m*60;
        System.out.println(h+":"+m+":"+s);
    }
     
    public static void main(String[]args){
        Main obj = new Main();
        obj.solve();
    }
}