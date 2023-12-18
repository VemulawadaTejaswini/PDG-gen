import java.util.*;
public class Main{
	public static void main(String[] args){
		int ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] as = new int[n];
		int[] pm = new int[n];
		int plus = 0;
		int minus = 0;
		int min = 10001;
		int min_where = -1;
		int pmzero = 0;
		
		for(int i=0; i<n; i++){
			as[i] = sc.nextInt();
			if(as[i] >= 0){
				pm[i] = 1;
				plus++;
				ans += as[i];
				if(as[i] < min){
					min = as[i];
					min_where = i;
				}
			}else{
				pm[i] = -1;
				minus++;
				ans -= as[i];
				if(-as[i] < min){
					min = -as[i];
					min_where = i;
				}
			}
		}
		
		if(plus == 0 || minus == 0){
			ans -= 2 * min;
			if(plus == 0){
				plus++;
				minus--;
				pmzero = 1;
			}else{
				plus--;
				minus++;
				pmzero = -1;
			}
		}
		
		System.out.println(ans);
		
		int[] plus_nums = new int[plus];
		int[] minus_nums = new int[minus];
		int p = 0;
		int m = 0;
		
		for(int i=0; i<n; i++){
			if(i != min_where){
				if(as[i] >= 0){
					plus_nums[p] = as[i];
					p++;
				}else{
					minus_nums[m] = as[i];
					m++;
				}
			}
			if(pmzero != 0){
				if(pmzero == 1){
					plus_nums[0] = as[min_where];
				}else{
					minus_nums[0] = as[min_where];
				}
			}
			else{
				if(as[min_where] >= 0){
					plus_nums[plus - 1] = as[min_where];
				}else{
					minus_nums[minus - 1] = as[min_where];
				}
			}
		}
		
		int x,y;
		int p_where = 0;
		int m_where = 0;
		int len = minus;
		
		if(plus > minus + 1){
			int gap = plus - minus - 1;
			y = minus_nums[0];
			for(int i=0; i<gap; i++){
				System.out.print(y);
				System.out.print(" ");
				System.out.println(plus_nums[i]);
				y -= plus_nums[i];
			}
			minus_nums[0] = y;
			p_where = gap;
			m_where = 0;
			len = minus;
		}
		if(plus < minus + 1){
			int gap = minus - plus + 1;
			x = plus_nums[0];
			for(int i=0; i<gap; i++){
				System.out.print(x);
				System.out.print(" ");
				System.out.println(minus_nums[i]);
				x -= minus_nums[i];
			}
			plus_nums[0] = x;
			p_where = 0;
			m_where = gap;
			len = plus - 1;
		}
		
		for(int i=0; i<len; i++){
			System.out.print(minus_nums[m_where + i]);
			System.out.print(" ");
			System.out.println(plus_nums[p_where + i + 1]);
			System.out.print(plus_nums[p_where]);
			System.out.print(" ");
			System.out.println(minus_nums[m_where + i] - plus_nums[p_where + i + 1]);
			plus_nums[p_where] -= (minus_nums[m_where + i] - plus_nums[p_where + i + 1]);
		}
		
	}
}
