import java.util.*;
import java.io.*;
 
public class Main{
	public static String toBin(long A) {
		String S = "";
		while(A != 0){
			long amari = A%2;
			S = String.valueOf(amari) + S;
			A = A/2;
		}
		for(int i = S.length(); i < 40; i++){
			S = "0" + S;
		} 
		return S;
	}
    
	public static void main(String[] $){
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		String[] A = new String[N];
		String xor = "0000000000000000000000000000000000000000";
		for(int i = 0; i < N; i++){
			long moto = s.nextLong();
			A[i] = toBin(moto);
			String exam = "";
			for(int j = 0; j < 40; j++){
				if(xor.charAt(j) == A[i].charAt(j)){
					exam = exam+"0";
				}else{
					exam = exam+"1";
				}
			}
			xor = exam;
		}

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++){
			String result = "";
			for(int j = 0; j < 40; j++){
				if(xor.charAt(j) == A[i].charAt(j)){
					result = result+"0";
				}else{
					result = result+"1";
				}
			}
			sb.append(Long.parseLong(result, 2) + " ");
		}
		System.out.println(sb.toString());
	}
} 