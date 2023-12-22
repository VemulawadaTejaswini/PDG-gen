import java.util.*;
import java.io.*;
 
public class Main{
 
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        int N = s.nextInt();
        int max = 0;
        
        for(int i = 0; i <= Math.min(N, B-1); i++){
            max = Math.max(max, A*i/B);
        }

        System.out.println(max);
	}
} 