import java.util.Scanner;

public class Main {
    
    static int[] a;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(sc.next());
        }
        int q = Integer.parseInt(sc.next());
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < q; i++){
            int m = Integer.parseInt(sc.next());
            if(solve(0, m)){
                sb.append("yes");
            }else{
                sb.append("no");
            }
            sb.append(System.lineSeparator());
        }
        
        System.out.print(sb);
    }
    
    static boolean solve(int i, int m){
        
        if(m == 0) return true;
        if(i >= a.length) return false;
        return solve(i+1, m) || solve(i+1, m-a[i]);
    }
}
