import java.util.Scanner;

public class Main{ 
    static int [] e;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        e = new int [n];
        for(int x = 0; x < n; x++){
            e[x] = scan.nextInt();
        }
        int q = scan.nextInt();
        int [] qu = new int[q];
        for (int x = 0; x < q; x++){
            qu[x] = scan.nextInt();
        }
        for (int x = 0; x < q; x++){
            if(solve(0, qu[x])){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
    static public boolean solve(int p, int t){
        if(t == 0){
            return true;
        }
        else if(p == e.length){
            return false;
        }
        else if(t < 0){
            return false;
        }
        else{
            return solve(p +1, t) || solve(p + 1, t - e[p]);
        }
    }
}
