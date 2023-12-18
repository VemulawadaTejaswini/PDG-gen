import java.util.*;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] countk = new int[100000];
		int[] countg = new int[100000];
		int flag = 1;
		int kmax = 0;
		int kmaxid = 0;
		int gmax = 0;
		int gmaxid = 0;
		for(int i = 1; i <= n; i++){
			int v = sc.nextInt();
			if(flag == 1){
				countk[v]++;
				if(kmax < countk[v]){
					kmaxid = v;
					kmax = countk[v];
				}
			}else{
				countg[v]++;
				if(gmax < countg[v]){
					gmaxid = v;
					gmax = countg[v];
				}
			}
			flag = 1 - flag;
		}
		if(kmaxid == gmaxid){
			System.out.print(n/2);
		}else{
			int answer;
			if(kmax > gmax){
				answer = n/2-gmax;
			}else{
				answer = n/2-kmax;
			}
			System.out.print(answer);
		}
	}
}
