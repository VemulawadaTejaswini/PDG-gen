import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			int n = sc.nextInt();
			int m = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[m];
			for(int i=0;i<n;i++) a[i] = sc.nextInt();
			for(int i=0;i<m;i++) b[i] = sc.nextInt();
			
			int count = 0;
			int max = 0;
			for(int i=0;i<m;i++){
				for(int j=0;j<n;j++){
					if(a[j]==b[i]){
						count = 0;
						for(int k=j;k<n;k++){
							if(a[k]==b[i+count]) count++;
							if(i+count==m) break;
						}
						max = Math.max(max, count);
					}
				}
			}
			System.out.println(max);
		}
	}
}