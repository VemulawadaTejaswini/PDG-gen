import java.util.*;
public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Scanner a = new Scanner(System.in);
	Scanner b = new Scanner(System.in);
	int N = sc.nextInt();
	int sum =0;
	for(int i=0;i<N;i++) {
		int l = a.nextInt();int r = b.nextInt();
		sum+=r-l+1;
	}
	System.out.println(sum);
	}
}
