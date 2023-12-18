import java.util.Scanner;

public class Main{
	static public void  main(String[] args){
		Scanner scan = new Scanner(System.in);

		int[] a = new int[6];
		int[] t = new int[4];

		for (int i = 0; i < 6;i++){
			t[ scan.nextInt() -1]++;
		}
		int min = 6;
		int max = 0;
		for (int i = 0; i < 4;i++){
			if(min > t[i]) min = t[i];
			if(max < t[i]) max = t[i];
		}
		boolean yes = min > 0 && max < 3;

		if(yes){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
