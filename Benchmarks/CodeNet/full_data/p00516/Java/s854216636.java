import java.util.Scanner;
public class Main {
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int N,M,max = 0;
	N = sc.nextInt();
	M = sc.nextInt();
	int n[] = new int [N];
	int m[] = new int [M];
	int vote[] = new int [N];
	for(int i = 0;i < N;i++){
		n[i] = sc.nextInt();
		vote[i] = 0;
	}
	for(int i = 0;i < M;i++){
		m[i] = sc.nextInt();
	}
	for(int i = 0;i < M;i++){
		for(int k = 0;k < N;k++){
			if(m[i] >= n[k]){
				vote[k]++;
				break;
			}
		}
	}
	for(int i = 0;i < N;i++){
		if(vote[max] < vote[i])max = i;
		System.out.println(vote[i]);
	}
	System.out.println(max + 1);
	}
}