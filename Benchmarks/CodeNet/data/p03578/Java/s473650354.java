import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> temp = new ArrayList<>();
		ArrayList<Integer> temp2 = new ArrayList<>();
		int N = sc.nextInt();
		int[] D = new int[N];
		for(int i = 0;i<N;i++){
			D[i] = sc.nextInt();
			temp.add(D[i]);
		}
		Collections.sort(temp);
		System.out.println(temp);
		int M = sc.nextInt();
		int[] T = new int[M];
		for(int j = 0;j<M;j++){
			T[j] = sc.nextInt();
			temp2.add(T[j]);
		}
		Collections.sort(temp2);
		System.out.println(temp2);
		//int m = M;
		int c =0;
		int ans=0;
		for(int k=0;k<M;k++){
			for(int a=c;a<N;a++){
				if(temp2.get(k).equals(temp.get(a))){
				    c=a+1;
					ans++;
					break;
				}
			}

		}
		

		if(ans==M){
			System.out.println("YES"+ans);
		}else{
			System.out.println("NO"+ans);
		}

	}
}