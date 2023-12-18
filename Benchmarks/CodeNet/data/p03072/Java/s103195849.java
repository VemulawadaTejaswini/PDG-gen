import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int[] H = new int[N];
		// Nコの高さが与えられる
		for(int i = 0; i< N; i++){
			H[i] = sc.nextInt();
		}
		
		int innNumber = 1;
		for(int i = 0; i< N; i++){	
			for(int j = 1; j< i+1; j++){
				if(H[j]-H[i]<0){
					break;
				}
			}
			innNumber = innNumber + 1;
		}
		System.out.println(innNumber);
	}
}
