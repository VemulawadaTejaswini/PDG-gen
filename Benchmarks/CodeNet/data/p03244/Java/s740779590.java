import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] gcnt = new int[100001];
		int[] kcnt = new int[100001];
		int gmax = 0;
		int gmax2 = 0;
		int gid = 0;
		int gid2 = 0;
		int kmax = 0;
		int kmax2 = 0;
		int kid = 0;
		int kid2 = 0;
		for(int i = 0; i < n; i++){
			int tmp = sc.nextInt();
			if(i%2==0){
				gcnt[tmp]++;
				if(gmax <= gcnt[tmp]){
					if(tmp != gid){
						gmax2 = gmax;
						gid2 = gid;
					}
					gmax = gcnt[tmp];
					gid = tmp;
				}
				if(tmp == gid2){
					gmax2++;
				}
			}else{
				kcnt[tmp]++;
				if(kmax <= kcnt[tmp]){
					if(tmp != kid){
						kmax2 = kmax;
						kid2 = kid;
					}
					kmax = kcnt[tmp];
					kid = tmp;
				}
				if(tmp == kid2){
					kmax++;
				}
			}
		}
		if(gid != kid){
			System.out.print(n-gmax-kmax);
		}else{
			if(gmax+kmax==n){
				System.out.print(n/2);
			}else if(n-gmax-kmax2 > n-gmax2-kmax){
				System.out.print(n-gmax2-kmax);
			}else{
				System.out.print(n-gmax-kmax2);
			}
		}
	}
}
