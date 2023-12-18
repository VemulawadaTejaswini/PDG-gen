import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int[] e = new int[b];
		int[] f = new int[b];
		int[] ans = new int[b];
		int[] n = {2,5,5,4,5,6,3,7,6};
		for(int i=0;i<b;i++){
			int c =scan.nextInt();
			e[i] =c;
			f[i] =n[c-1];
		}
		Arrays.sort(f);
		Arrays.sort(e);
		int p=0;
		int u = a/f[0];
		ans[0]=u;
		int k = a%f[0];
		boolean flg=true;
		while(flg){
			if(k==0){break;}
			a=k+f[0];
			ans[0]--;
			for(int i=p;i<b;i++){
				if(a%f[i]==0){
					ans[i]++;
					flg=false;
					break;
				}
			}
			if(flg){
				while(true){
					if(a-f[p]>0){
						a-=f[p];
						ans[p]++;
					}else{
						break;
					}
				}
			}
			k=a;
			p++;
		}

		for(int i=b;i>0;i--){
			for(int l=8;l>=0;l--){
				if(n[l]==f[i-1]){
					for(int u=0;u<b;u++){
						if(l+1==e[u]){
							for(int y=0;y<ans[i-1];y++){
						System.out.print(f[l]);
					}
						}
					}
				}
			}
		}

	}
}