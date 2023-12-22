import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
        int[] ans = new int[n+1];
        for(int a = 1; a <= 100; a++){
            for(int b = 1; b <= 100; b++){
                for(int c = 1; c <= 100; c++){
                    int val = a*a + b*b + c*c + a*b + a*c + c*b;
                    if(val <= n){
                        ans[val]++;
                    }
                }
            }
        }

        for(int i = 1; i <= n; i++){
            System.out.println(ans[i]);
        }
	}
}
