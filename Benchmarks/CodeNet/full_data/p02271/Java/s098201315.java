import java.util.Scanner;

public class Main{

    static int[] A = new int[50];
    static int n;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i < n; i++){
            A[i] = sc.nextInt();
        }
        int q = sc.nextInt();
        for(int i = 0; i < q; i++){
            int M = sc.nextInt();
            if(solve(0,M)){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }

    public static boolean solve(int i, int m){
        if(m == 0) return true;
        if(i >= n) return false;
        boolean res = (solve((i + 1), m)) || (solve((i + 1), (m - A[i])));
        return res;
    }
}
