import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n, q, cnt = 0, isExist;
		int[] S = new int[100000], T = new int[50000];
		
		n = sc.nextInt();
		for(int i = 0; i < n; i++){
			S[i] = sc.nextInt();
		}
		
		q = sc.nextInt();
		for(int i = 0; i < q; i++){
			T[i] = sc.nextInt();
		}
		
		for(int i = 0; i < q; i++){
			isExist = binarySearch(T[i], S, n);
			if(isExist == 1){
				cnt ++;
			}
		}
		
		System.out.println(cnt);
	}
	
	public static int binarySearch(int t, int[] S, int len){
		int first = 0, last = len - 1, middle;
		int isExist = 0;
		
		while(isExist == 0 && first <= last){
			middle = (first + last) / 2;
			if(S[middle] == t){
				isExist = 1;
			}
			else if(t < S[middle]){
				last = middle - 1;
			}
			else if(S[middle] < t){
				first = middle + 1;
			}
		}
		
		return isExist;
	}
}