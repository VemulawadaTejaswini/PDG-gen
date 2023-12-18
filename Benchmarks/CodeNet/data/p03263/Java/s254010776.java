import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<String> list = new ArrayList<>(); 
		int h = sc.nextInt();
		int w = sc.nextInt();
		int a[][] = new int[h][w];
		for (int i=0;i<h;i++)
			for (int j=0;j<w;j++) {
				a[i][j] = sc.nextInt()%2;
			}
		
		for (int i=0;i<h;i++)
			for (int j=0;j<w;j++) {
				if (a[i][j]==1 && j<w-1) {
					a[i][j] = 0;
					a[i][j+1]=(a[i][j+1]+1)%2;
					list.add((i+1)+" "+ (j+1) + " " + (i+1)+" "+ (j+2));
				}
				if (a[i][j]==1 && i<h-1) {
					a[i][j] = 0;
					a[i+1][j]=(a[i+1][j]+1)%2;
					list.add((i+1)+" "+ (j+1) + " " + (i+2)+" "+ (j+1));
				}
			}
		System.out.println(list.size());
		for (int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
	}
}
