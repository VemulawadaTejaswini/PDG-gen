import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k=sc.nextInt();
		int o=0,a=0;
		for(int i=1;i<=k;i++) {
			if(i%2==0) {
				a++;
			}else {
				o++;
			}
		}
		System.out.println(a*o);

	}
}

