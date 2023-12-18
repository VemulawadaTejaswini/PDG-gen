import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int p[] = new int[100000];
		for(int i = 0 ; i < n ; i++){
			p[i] = sc.nextInt();
		}
		int le[] = new int[2];
		int ri[] = new int[2];
		int c = 0;
		int ans = 0;
		for(int i = 0 ; i < n ; i++){
			le[0] = -1;
			le[1] = -1;
			ri[0] = n;
			ri[1] = n;
			c = 0;
			for(int j = i-1 ; j >= 0 ; j--){
				if(p[j] > p[i]){
					le[c] = j;
					c++;
					if(c == 2){
						break;
					}
				}
			}
			c = 0;
			for(int j = i+1 ; j < n ; j++){
				if(p[j] > p[i]){
					ri[c] = j;
					c++;
					if(c == 2){
						break;
					}
				}
			}
			ans += (le[0] == -1)? 0 : p[i]*(i-le[1]-1)*(ri[0]-i);
			ans += (ri[0] == n)? 0 : p[i]*(i-le[0])*(ri[1]-i-1);
		}

		System.out.println(ans);
	}
}