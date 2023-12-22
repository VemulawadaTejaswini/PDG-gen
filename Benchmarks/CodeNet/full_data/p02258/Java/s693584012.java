import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int val[] = new int[N];
		int cnt[] = new int[N];
		int val_cnt=0;
		int i, j, x;
		for(i=0; i<N; i++){
			x = sc.nextInt();
			for(j=0; j<val_cnt; j++){
				if(x==val[j]) break;
			}
			val[j] = x;
			cnt[j]++;
			if(j==val_cnt) val_cnt++;
		}
		for(i=0, j=1; j<val_cnt; j++){
			if(cnt[i]<cnt[j]) i = j;
		}
		System.out.println(val[i]);
	}
}