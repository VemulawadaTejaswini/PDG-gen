import java.awt.*;
import java.io.*;
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
		new TestC().doIt();
//		new TestD().doIt();
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
			String S = sc.next();
			int length = S.length();
			char setRL[] = S.toCharArray();
			int children[][] = new int[2][length];
			int copyChildren[] = new int[length];
			for(int x = 0;x < length;x++){
				children[0][x] = 1;
				copyChildren[x] = children[0][x];
			}
			moveChildren(setRL,children,copyChildren,length);
			for(int x = 0;x < length-1;x++){
				System.out.print(copyChildren[x]+" ");
			}
			System.out.println(copyChildren[length - 1]);
		}
		void moveChildren(char RLSet[],int children[][],int copyChildren[],int length){
			while(true){
				boolean isTheSameSet = true;
				for(int y = 0;y < 2;y++){
					for(int x = 0;x < length;x++){
						if(RLSet[x] == 'R'){
							children[(y+1)%2][x+1] += children[y%2][x];
							children[y%2][x] = 0;
						}
						else{
							children[(y+1)%2][x-1] += children[y%2][x];
							children[y%2][x] = 0;
						}
					}
				}
				for(int x = 0;x < length;x++){
					if(children[0][x] != copyChildren[x])isTheSameSet = false;
					copyChildren[x] = children[0][x];
				}
				if(isTheSameSet)break;
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