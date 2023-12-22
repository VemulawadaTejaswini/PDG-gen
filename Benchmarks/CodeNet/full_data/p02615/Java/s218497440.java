import java.util.*;
import java.io.*;
import java.math.BigInteger;
 
public class Main{
	public static String toBinary(int x){
		String s = Integer.toBinaryString(x);
		for(int i = s.length(); i < 6; i++){
			s = "0" + s;
		}
		return s;
	}
    
	public static void main(String[] $){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] A = new int[N];
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i < N; i++){
			list.add(sc.nextInt());
		}

		Collections.sort(list);
		long sum = 0;
		for(int i = 1; i < N; i++){
			sum = sum + list.get(i);
		}
		
		System.out.println(sum);
		
	}
} 