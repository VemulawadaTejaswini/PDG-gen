import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		String[] name = new String[N];
		String[] test = new String[N];
		for(int i = 0;i<N;i++) {
			name[i]= scn.next();
			name[i]+= (100-scn.nextInt());
		}
		System.arraycopy(name,0,test,0,N);
		Arrays.sort(name);
		List<String> ans =  Arrays.asList(test);
		for(String x:name) {
			System.out.println(ans.indexOf(x)+1);
		}
	}
}