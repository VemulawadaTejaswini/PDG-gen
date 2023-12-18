import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int N = scan.nextInt();

	int[] a_ = new int[N];
	for(int i = 0; i < N; i++){
	    a_[i] = scan.nextInt();
	}

	Arrays.sort(a_);
	int K = a_[N-1];
	
	//連想配列を使用
	int[] num_ = new int[K+1];
	for(int i = 0; i < N; i++){
	    num_[a_[i]]++;
	}

	int max = 0;
	for(int i = 1; i < K; i++){
	    int tmp = num_[i-1]+num_[i]+num_[i+1];
	    if(tmp > max){
		max = tmp;
	    }
	}

	System.out.println(max);
    }
}
