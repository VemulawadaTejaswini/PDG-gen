import java.util.*;

class Main{
	public static void main(String[] $){
		System.err.println();
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[][] f=new int[n][2];
		for(int i=0;i<n;++i)
			f[i][0]=s.nextInt();
		for(int i=0;i<n;++i)
			f[i][1]=s.nextInt();

		Arrays.sort(f,Comparator.<int[]>comparingInt(a->a[0]).thenComparing(a->a[1]));

		int r=0;

		for(int i=0;i<n;++i){
			if(f[i][0]<=f[i][1])
				continue;

			for(int j=0;j<i;++j){
				if(f[j][0]<=f[i][1]&&f[i][0]<=f[j][1]){
					if((++r)>n-2){
						System.out.println("No");
						return;
					}

					int t=f[i][1];
					f[i][1]=f[j][1];
					f[j][1]=t;
				}
			}
		}

		for(int[] o:f){
			if(o[0]>o[1]){
				System.out.println("No");
				return;
			}
		}

		System.out.println("Yes");
	}
}
