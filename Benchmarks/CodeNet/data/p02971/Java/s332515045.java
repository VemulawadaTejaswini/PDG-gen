import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int suretu[] = new int[n];
		for(int i=0;i<n;i++) {
			suretu[i] = scan.nextInt();
		}
		for(int i=0;i<n;i++) {
			int max = 0;
			for(int j=0;j<n;j++) {
				if(j == i) {
					continue;
				}
				if(max < suretu[j]) {
					max = suretu[j];
				}
			}
			System.out.println(max);
		}
		
	}

}


