import java.util.Scanner;

public class Main{
    
 
    public static void main(String[] args)  {
        new Main().solve();
    }

    void solve(){
        Scanner sc = new Scanner(System.in);        
        int L = Integer.parseInt(sc.next());
        sc.close();

        double n1,n2,n3;
        
        n1 = L/3;
        n2 = L/3;
        n3 = L - n1 -n2;

        System.out.println(n1 * n2 * n3);

    }
}