import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[200000];
		int[] t = new int[200000];
		int color = 0;
		Boolean stacked = false;

		for(int i = 0 ; i < n ; i++){
			a[i] = sc.nextInt();
			stacked = false;
			for(int j = 0 ; j < color ; j++){
				if(t[j] < a[i]){
					t[j] = a[i];
					stacked = true;
					break;
				}
			}
			if(!stacked){
				t[color] = a[i];
				color++;
			}
		}

		System.out.println(color);
	}
}