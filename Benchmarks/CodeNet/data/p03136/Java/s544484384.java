import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt(),max=0,total=0;
		for(int i=0; i<N; i++) {
			int l = sc.nextInt();
			if(max < l) {
				total+=max;
				max=l;
			}else {
				total+=l;
			}
		}
		System.out.println(max<total?"Yes":"No");
	}
}
