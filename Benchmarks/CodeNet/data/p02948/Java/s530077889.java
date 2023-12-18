import java.util.*;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0; i < n; i++){
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}
		int m1 = 1;
		int ans = 0;
		while(m1 != m+1){
			int j = 0,max = 0,limit = 0;
			for(int i = 0; i < n; i++){
				if(b[i] > max){
				max = b[i];
				j = i;
			}
				if(b[i] == max){
					max = b[i];
					if(a[j] < a[i]){
						j = i;
					}
				}
			}
			if(a[j] <= m1){
			    ans += b[j];
				//System.out.println(b[j]);
				b[j] = 0;
			}else{
				break;
			}
			m1++;
		}
		System.out.println(ans);
		
	}
	}