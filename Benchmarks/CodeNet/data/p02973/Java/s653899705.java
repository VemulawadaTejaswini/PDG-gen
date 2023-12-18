import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[200000];
		int[] t = new int[200000];
		int color = 1;
		t[0] = a[0];
		int stackablenum = 0;


		for(int i = 1 ; i < n ; i++){
			a[i] = sc.nextInt();
			stackablenum = color-1;
			while(stackablenum >= 0 && a[i] > t[stackablenum]){
				stackablenum--;
			}
			t[stackablenum+1] = a[i];
			if(stackablenum == color-1){
				color++;
			}
		}

		System.out.println(color);
	}
}