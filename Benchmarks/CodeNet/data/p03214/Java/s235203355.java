import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[][] sm=new int[N][2];
		int sum=0;
		for(int i=0; i<N; i++) {
			sm[i][0]=sc.nextInt();
			sum+=sm[i][0];
			sm[i][0]*=N;
			sm[i][1]=i;
		}
		quick_sort(sm,0,N-1);
		int dif_min=Integer.MAX_VALUE;
		int banme=0;
		for(int i=0; i<N; i++) {
			if(dif_min==Math.abs(sm[i][0]-sum)) {
				if(banme>sm[i][1]) {
					banme=sm[i][1];
				}
			}
			else if(dif_min>Math.abs(sm[i][0]-sum)) {
				dif_min=Math.abs(sm[i][0]-sum);
				banme=sm[i][1];
			}
		}
		System.out.println(banme);
	}
	static void quick_sort(int[][] d, int left, int right) {
        if (left>=right) {
            return;
        }
        int p = d[(left+right)/2][0];
        int l = left, r = right, tmp,tmp1,tmp2;
        while(l<=r) {
            while(d[l][0] < p) { l++; }
            while(d[r][0] > p) { r--; }
            if (l<=r) {
                tmp = d[l][0]; d[l][0] = d[r][0]; d[r][0] = tmp;
                tmp1=d[l][1]; tmp2=d[r][1]; d[l][1]=tmp2; d[r][1]=tmp1;
                l++; r--;
            }
        }
        quick_sort(d, left, r);
        quick_sort(d, l, right);
    }
}