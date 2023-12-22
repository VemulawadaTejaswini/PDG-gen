import java.util.Scanner;

public class Main {
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.next());
		for(int i = 0;i < n;i++){
			int a[] = {0,0,0};
			for (int j = 0;j <3;j++){
				a[j] = (int) Math.pow(Integer.parseInt(scan.next()),2);
			}
			java.util.Arrays.sort(a);
			if(a[0]+a[1]==a[2]){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
		System.exit(0);
	}
}