import java.util.Scanner;

public class Main{
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int a[] = new int[5000];
		while(true){
			int n = Integer.parseInt(scan.next());
			if(n == 0)break;
			int l = 0;
			for(int i = 0;i < n;i++){
				int m = Integer.parseInt(scan.next());
				for(int j = 0;j < i;j++){
					a[j] = a[j] + m;
					if(a[j] >= l)l = a[j];
				}
			}
			System.out.println(l);
		}
		System.exit(0);

	}

}