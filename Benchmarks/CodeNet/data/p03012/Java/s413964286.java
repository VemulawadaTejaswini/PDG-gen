import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Weight = new int[n];
        for(int i = 0; i < n; i++){
            Weight[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            sum = sum + Weight[i];
        }
        int subsum = 0;
        int sub = 0;
        int submin = sum;
        for(int i = 0; i < n; i++){
            subsum = subsum + Weight[i];
            sub = Math.abs((sum - subsum) - subsum);
            if(sub < submin){
                submin = sub;
            }
        }
        System.out.print(submin);
    }
}