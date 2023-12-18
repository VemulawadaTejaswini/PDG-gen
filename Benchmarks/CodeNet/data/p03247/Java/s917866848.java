import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

import org.omg.Messaging.SyncScopeHelper;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new ARC103_C().doIt();
	}
	class ARC103_C{
		void doIt() {
			int N = sc.nextInt();
			int X[] = new int[N];
			int Y[] = new int[N];
			String S[] = new String[N];
			for(int i = 0;i < N;i++) {
				X[i] = sc.nextInt();
				Y[i] = sc.nextInt();
			}
			if(check(N,S,X,Y) == -1)System.out.println(-1);
		}
		int check(int N,String S[],int X[],int Y[]) {
			for(int i = 1;i <= 40;i++) {
				int cnt = 0;
				for(int j = 0;j < N;j++) {
					if(i == 1)S[j] = "";
					if(X[j] > 0) {
						S[j] = S[j] + "R";
						X[j] = X[j] - 1;
					}else if(X[j] < 0) {
						S[j] = S[j] + "L";
						X[j] = X[j] + 1;
					}else if(Y[j] > 0) {
						S[j] = S[j] + "U";
						Y[j] = Y[j] - 1;
					}else if(Y[j] < 0) {
						S[j] = S[j] + "D";
						Y[j] = Y[j] + 1;
					}else {
						S[j] = S[j] + "R";
						X[j] = X[j] - 1;
					}
					if(X[j] == 0 && Y[j] == 0)cnt++;
				}
				if(cnt == N) {
					System.out.println(i);
					System.out.print(1);
					for(int j = 1;j < i;j++) {
						System.out.print(" "+1);
					}
					System.out.println();
					for(int j = 0;j < N;j++) {
						System.out.println(S[j]);
					}
					return 0;
				}
			}
			return -1;
		}
	}
}
