import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] a = new int[500];
		int[] tmp = new int[500];
		int facNum = 0;
		int[] fac = new int[10000];
		int[] facMax = new int[10000];
		int ans = 1;
		int sum = 0;

		for(int i = 0 ; i < n ; i++){
			a[i] = sc.nextInt();
			sum += a[i];
		}

		int sq = (int)(Math.sqrt(sum));
		for(int i = 1 ; i <= sq ; i++){
			if((sum % i) == 0){
				fac[facNum] = i;
				facMax[facNum] = sum/i;
				facNum++;
			}
		}

		if(fac[facNum-1] == facMax[facNum-1]){
			for(int i = 0 ; i < facNum-1 ; i++){
				fac[facNum+i-1] = fac[facNum-i-2];
			}
			facNum = facNum*2-1;
		}else{
			for(int i = 0 ; i < facNum ; i++){
				fac[facNum+i] = fac[facNum-i-1];
			}
			facNum = facNum*2;
		}

		int tmpsum = 0;
		int tmpmax = 0;
		for(int i = facNum-1 ; i > 0 ; i--){
			tmpsum = 0;
			tmpmax = 0;
			for(int j = 0; j < n ; j++){
				tmp[j] = (a[j] % fac[i]);
				tmpsum += (a[j] % fac[i]);
			}
			for(int j = n; j < 500 ; j++){
				tmp[j] = 0;
			}
			tmpsum /= fac[i];
			Arrays.sort(tmp);
			for(int j = 0 ; j < tmpsum ; j++){
				tmpmax += fac[499-i] - tmp[499-j];
			}
			if(tmpmax <= k){
				ans = fac[i];
				break;
			}
		}

		System.out.println(ans);
	}
}