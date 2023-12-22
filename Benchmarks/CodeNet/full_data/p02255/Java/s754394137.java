import java.util.*;
public class Main{
	public static void insertion_sort(char A[]){
		int j,v,N;
		for(int i;i<=N-1;i++){
			v = A[i];
			j = i-1;
			while (j>=0 && A[j]>v){
				A[j+1] = A[j];
				j--;
				A[j+1] = v;
			}
		}
	}
}