//package atcoder;
 
import java.util.*;
 
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//char S[] = new char[3];
		int S[] = new int[3];
		for(int i=0;i<3;i++) {
			S[i] = sc.nextInt();
			//System.out.println(S[i]);
		}
		int temp=0;
		temp = S[0];
		S[0] = S[1];
		S[1] = temp;
		
		int temp2=0;
		temp2 = S[0];
		S[0] = S[2];
		S[2] = temp2;
		
		for(int j=0;j<3;j++) {
			System.out.print(S[j]+" ");
		}
	}
}