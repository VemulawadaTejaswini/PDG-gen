import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] list = new int[1000000];
		
		for(int x=1;x<32;x++) {
			for(int y=1;y<32;y++) {
				for(int z=1;z<32;z++) {	
					int t = (x*x+y*y+z*z+x*y+y*z+z*x);
					list[t]++;
				}
			}
		}
		for(int i=1;i<=n;i++) {
			System.out.println(list[i]);
		}
	}

}