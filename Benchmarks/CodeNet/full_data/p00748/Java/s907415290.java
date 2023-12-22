import java.util.*;
import java.io.*;

public class Main {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int ns[] = new int[1000], os[] = new int[1000];
		int dp1[] = new int [1000001], dp2[] = new int[1000001];
		int pos = 0;
		for(int i=1; ;i++){
			ns[i] = i*(i+1)*(i+2)/6;
			if(ns[i]%2 == 1){
				os[pos++] = ns[i];
			}
			if(ns[i] > 3000000) break;
		}
		for(int i=1; i<1000001;i++) dp1[i] = dp2[i] = 1<<29;
		for(int i=1; i<1000001;i++){
			for(int j=0; j<1000; j++){
				if(ns[j] > i) break;
				dp1[i] = Math.min(dp1[i], dp1[i-ns[j]]+1);
			}
			for(int j=0; j<1000; j++){
				if(os[j] > i) break;
				dp2[i] = Math.min(dp2[i], dp2[i-os[j]]+1);
			}
		}
		while(true){
			int n = in.nextInt();
			if(n==0) return ;
			System.out.printf("%d %d\n", dp1[n], dp2[n]);
		}
	}
}