import java.util.Scanner;
public class Main{
    int max;
    int min;
    int sa;
    public void solve(){
        Scanner sc = new Scanner(System.in);
        for(int k=0;k<7;k++){
            max=sc.nextInt();
            min=sc.nextInt();
            sa=max-min;
            System.out.println(sa);
        }
    }
    
    public static void main(String[] args){
        Main obj = new Main();
        obj.solve();
    }
}