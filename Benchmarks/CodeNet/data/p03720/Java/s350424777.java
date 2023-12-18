import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int N = scan.nextInt();
	int M = scan.nextInt();
	
	int[] a_ = new int[M];
	int[] b_ = new int[M];

	for(int i = 0; i < M; i++){
	    a_[i] = scan.nextInt();
	    b_[i] = scan.nextInt();
	}

	int[] road_ = new int[N+1];
	for(int i = 0; i < M; i++){
	    road_[a_[i]]++;
	    road_[b_[i]]++;
	}

	for(int i = 1; i <= N; i++){
	    System.out.println(road_[i]);
	}
    }
}
