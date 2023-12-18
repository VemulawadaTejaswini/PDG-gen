import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N,i;
		int count = 1;
		N = sc.nextInt();
		
		Integer[] Input = new Integer[N];
		
		for(i=0;i<N;i++) {
			Input[i] = sc.nextInt();
		}
		
		Arrays.sort(Input);
		
		for(i=0;i<N-1;i++) {
			if(Input[i]<Input[i+1]) {
				count = count+1;
			}
		}
		
		System.out.println(count);
		
	}

}