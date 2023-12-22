import java.util.*;
import java.io.*;
 
public class Main{
    
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
		int A = s.nextInt();
		int B = s.nextInt();
		int C = s.nextInt();
		int D = s.nextInt();
		int E = s.nextInt();
		if(A == 0){
			System.out.println(1);
		}else if(B == 0){
			System.out.println(2);
		}else if(C == 0){
			System.out.println(3);
		}else if(D == 0){
			System.out.println(4);
		}else{
			System.out.println(5);
		}
	}
} 