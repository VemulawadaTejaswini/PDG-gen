import java.util.Scanner;
public class Main{
    int kazu;
     
    public void solve(){
        Scanner sc = new Scanner(System.in);
        kazu = sc.nextInt();
        System.out.println(kazu*kazu*kazu);
    }
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}