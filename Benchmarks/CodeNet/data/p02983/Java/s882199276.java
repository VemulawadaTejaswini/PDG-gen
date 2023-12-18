import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int r = sc.nextInt();
		int ans;

		/*
		int k = ((l-1)/2019 + 1)*2019; //L <= k
		if(l == 0){
			k = 0;
		}

		if(k <= r){
			ans = 0;
		}else{
			ans = (((l % 2019)*((l+1) % 2019))) % 2019;
		}

		//ArrayList<Integer> iarr = new ArrayList<Integer>();
		*/
		int min = 2018;
		int i = 0;
		while(min > 0)
		{
			min = min > ((l+i) % 2019) ? ((l+i) % 2019) : min;
			i++;
			if(l+i > r){
				break;
			}
		}
		ans = (min*(min+1)) % 2019;

		System.out.println(ans);
	}

}