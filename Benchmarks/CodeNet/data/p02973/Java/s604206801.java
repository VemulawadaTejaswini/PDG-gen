import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[200000];

		for(int i = 0 ; i < n ; i++){
			a[i] = sc.nextInt();
		}

		int painted = 0;
		int color = 0;
		int now = 0;
		int start = 0;
		int end = n;
		Boolean first = true;
		int lastswap = n;
		while(painted < n){
			first = true;
			end = lastswap;
			now = a[start];
			a[start] = -1;
			painted++;
			start++;
			for(int i = start ; i < end ; i++){
				if(-1 == a[i]){
					//skip
				}else if(now < a[i]){
					//paint
					painted++;
					now = a[i];
					a[i] = -1;
				}else{
					if(first){
						start = i;
					}
					first = false;
					lastswap = i+1;
				}
			}
			color++;
		}

		System.out.println(color);
	}

}