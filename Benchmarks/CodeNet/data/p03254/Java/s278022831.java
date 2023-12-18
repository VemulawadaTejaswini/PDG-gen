import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int N = scan.nextInt();
	int x = scan.nextInt();

	int[] a_ = new int[N];
	int sum = 0;
	for(int i = 0; i < N; i++){
	    a_[i] = scan.nextInt();
	    sum += a_[i];
	}

	Arrays.sort(a_);

	if(sum == x){
	    System.out.println(N);
	}else{
	    int i = 0;
	    int sum_tmp = 0;
	    Boolean flag = false;
	    for(i = 0; i < N; i++){
		sum_tmp += a_[i];
		if(sum_tmp > x){
		    flag = true;
		    break;
		}
	    }
	    if(flag == true)
		System.out.println(i);
	    else
		System.out.println(N-1);
	}
    }
}
