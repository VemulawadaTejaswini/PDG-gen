import java.util.*;
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int memo[] = new int[n];
        Arrays.fill(memo, 0);
        memo[0] = 2;
        memo[1] = 1;

        int ans = lucas(n);
        System.out.println(ans);
    }
    static int lucas(int a){
        if(memo[a] == 0){ 
            memo[a] = lucas(a-1) + lucas(a-2);
            return memo[a];
        }else{
            return memo[a];
        }
    }
}