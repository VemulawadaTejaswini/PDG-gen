import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if((n|m)==0)break;
			int[] a = new int[m];
			int[] b = new int[m];
			int[] c = new int[n+1];
			int[] d = new int[n+1];
			for(int i=0;i<m;i++){
				a[i] = sc.nextInt();
				b[i] = sc.nextInt();
			}
			for(int i=0;i<m;i++){
				if(a[i]==1)c[b[i]]++;
				if(b[i]==1)c[a[i]]++;
			}
			
			for(int i=0;i<n+1;i++){
				if(c[i]>0){
					for(int j=0;j<m;j++){
						if(a[j]==i)d[b[j]]++;
						if(b[j]==i)d[a[j]]++;
					}
				}
			}

			int count=0;
			for(int i=0;i<n+1;i++){
				if(i!=1 && (c[i]>0 || d[i]>0))count++;
			}
			System.out.println(count);
		}
	}
}