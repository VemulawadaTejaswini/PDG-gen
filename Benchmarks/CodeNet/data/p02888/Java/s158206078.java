import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] len = new long[n];
		for(int i = 0 ; i<n; i++){
			len[i] = sc.nextInt();
		}
		Arrays.sort(len);
		long res = 0;
		for(int i = 0 ; i<len.length-1; i++){
			for(int j = i+1 ; j<len.length-1; j++){
				for(int k = j+1 ; k<len.length; k++){
					if(! (len[i]+len[j] > len[k]))break;
					res++;
				}
			}
		}
		System.out.println(res);
	}
}
