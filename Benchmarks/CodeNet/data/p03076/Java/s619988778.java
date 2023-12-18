import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a[] = new int[5];
		for(int i = 0; i < 5; i++){
			a[i] = sc.nextInt();
		}
		int min = 999;
		int soe = -1;
		for(int i = 0; i < 5; i++){
			if(a[i]%10 != 0){
				if(min > a[i]%10){
					soe = i;
					min = a[i]%10;
				}
			}
		}
		int ans = 0;
		for(int i = 0; i < 5; i++){
			if(soe == i){
				ans+=a[i];
			}else{
				ans+=(a[i]/10+(a[i]%10==0?0:1))*10;
			}
		}
		System.out.print(ans);
	}
}
