import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        boolean[] a = new boolean[n];
        for (int i=0;i<m;i++){
            int t = scan.nextInt();
            a[t-1] = true;
        }
        long sum = 0;
        sum = find(0, n, a, 0);
        System.out.println(sum);
    }

    static long find(int current, int n, boolean[] a, long sum){

        if (current > n){
            return sum;
        }
        
        if (current == n){
            sum += 1;
            return sum;
        }
        
        if ((current != 0)&&(a[current-1] == true)){
            return sum;
        }

        sum = find(current + 1, n, a, sum) + find(current + 2, n, a, sum);
        return sum;
    }
}