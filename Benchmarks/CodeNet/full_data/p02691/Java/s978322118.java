import java.util.*;
import java.io.*;
 
public class Main{
 
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        long[] A = new long[N];
        for(int i = 0; i < N; i++){
            A[i] = s.nextLong();
        }

        long result = 0;
        HashMap<Long, Long> map = new HashMap<Long, Long>();
        for(int i = 0; i < N; i++){
            map.put((long)(A[i] + i + 1), map.getOrDefault((A[i] + i + 1), 0L) + 1);
        }

        for(int i = 0; i < N; i++){
            result += map.getOrDefault((long)(i+1 - A[i]), 0L);
        }
        
        
        
        System.out.println(result);
        
        
	}
} 