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
		int H = sc.nextInt();
		int W = sc.nextInt();
		int K = sc.nextInt();
		String[] c = new String[H];
		for(int i = 0; i < H; i++){
			c[i] = sc.next();
		}

		int sum = 0; 
		String iBi = "";
		String jBi = "";
		for(int i = 0; i < Math.pow(2, H); i++){
			iBi = toBinary(i);
			for(int j = 0; j < Math.pow(2, W); j++){
				jBi = toBinary(j);
				int exam = 0;
				for(int x = 0; x < H; x++){
					if(iBi.charAt(5-x) == '1') continue;
					for(int y = 0; y < W; y++){
						if(jBi.charAt(5-y) == '1') continue;
						if(c[x].charAt(y) == '#') exam++;
					}
				}
				if(exam == K) sum++;
			}
		}
		
		System.out.println(sum);
		
	}
} 