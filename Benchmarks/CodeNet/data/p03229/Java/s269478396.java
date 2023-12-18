
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//		int max = 100000;
		Scanner sc = new Scanner(System.in);
		int max = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		
		for(int i=0;i<max;i++) {
			int j,n;
			n=sc.nextInt();
			for(j=0;j<al.size();j++) {
				if(n>+al.get(j)) {
					break;
				}
			}
			al.add(j,n);
		}
		
		int ans1 = 0;//center = min
//		int ans2 = 0;//center = max
		int j=0;

		if (max % 2 == 0) {//guusuu
			for(;j<(max-2)/2;j++) {
				ans1 += al.get(j)*2;
			}
			ans1 += al.get(j++);
			ans1 -= al.get(j++);
			for(;j<max;j++) {
				ans1 -= al.get(j)*2;
			}

		} else {//kisuu
			for(;j<(max-1)/2;j++) {
				ans1 += al.get(j)*2;
			}
			ans1 -= al.get(j++);
			ans1 -= al.get(j++);
			for(;j<max;j++) {
				ans1 -= al.get(j)*2;
			}
		}
		System.out.println(ans1);
		sc.close();

	}

}