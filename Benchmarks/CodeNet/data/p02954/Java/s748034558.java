import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
//		new TestC().doIt();
		new TestD().doIt();
//		new TestE().doIt();
	}
	class TestE{
		void doIt(){
			int N = sc.nextInt();
			int K = sc.nextInt();
			int A[] = new int[N];
			for(int i = 0;i < N;i++){
				A[i] = sc.nextInt();
			}
			System.out.println(maxGCD(N,K,A));
		}
		int maxGCD(int N,int K,int A[]){
			int result = 0;
			for(int i = 1;i < 100;i++){
				int sum = 0;
				for(int j = 0;j < N;j++){
					if((A[j] % i) < i/2){
						sum = sum + A[j] % i;
					}else{
						sum = sum - i + (A[j] % i);
					}
				}
				System.out.println(i+" "+sum);
			}
			return 0;
		}
	}
	class TestD{
		void doIt(){
			String S = sc.next() + 'R';
			int length = S.length();
			char setRL[] = S.toCharArray();
			int children[] = new int[length];
			moveChildren(setRL,children,length);
			for(int i = 0;i < length-2;i++){
				System.out.print(children[i]+" ");
			}
			System.out.println(children[length - 2]);
		}
		void moveChildren(char RLSet[],int children[],int length){
			char c = 'R';
			int cnt = 1;
			for(int i = 1;i < length;i++) {
				if(RLSet[i] == c) {
					cnt++;
				}else {
					if(c == 'R') {
						children[i - 1] = children[i - 1] + (cnt / 2) + (cnt % 2);
						children[i] = children[i] + (cnt / 2);
						c = 'L';
						cnt = 1;
					}else {
						children[i - cnt - 1] = children[i - cnt - 1] + (cnt / 2);
						children[i - cnt] = children[i - cnt] + (cnt / 2) + (cnt % 2);
						c = 'R';
						cnt = 1;
					}
				}
			}
		}
	}
	class TestC{
		void doIt(){
			int N = sc.nextInt();
			int H[] = new int[N];
			for(int i = 0;i < N;i++){
				H[i] = Integer.parseInt(sc.next());
			}
			boolean result = canMonotonousDecrease(N,H);
			if(result){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}
 		}
		boolean canMonotonousDecrease(int N,int H[]){
			for(int i = 1;i < N;i++){
				int diff = H[i] - H[i-1];
				if(diff > 0)H[i] = H[i] - 1;
				else if(diff < 0)return false;
			}
			return true;
		}
	}
}