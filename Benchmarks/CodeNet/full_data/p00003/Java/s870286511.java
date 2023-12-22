import java.util.Scanner;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for(int i=0; i<n; i++){
			int a[] = new int[3];
			a[0] = in.nextInt();
			a[1] = in.nextInt();
			a[2] = in.nextInt();
			Arrays.sort(a);
			if(a[0]*a[0] + a[1]*a[1] == a[2]*a[2]){
				System.out.println("YES");
			}
			else{
				System.out.println("NO");
			}
		}
	}

}