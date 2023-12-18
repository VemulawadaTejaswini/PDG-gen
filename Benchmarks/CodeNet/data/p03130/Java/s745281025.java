import java.util.Scanner;

public class YahooBPath {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] nodes = new int[] {0,0,0,0};
		for(int i = 0; i < 3; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			nodes[a-1]++;
			nodes[b-1]++;
		}
		
		for(int i = 0; i < 3; i++) {
			if(nodes[i] < 0 || nodes[i] >= 3) {
				System.out.println("NO");
				return;
			}
		}
		
		System.out.println("YES");
	}

}
