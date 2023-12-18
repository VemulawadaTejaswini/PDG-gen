import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i=0;i<n;i++) array.add(sc.nextInt());
		Collections.sort(array);
		int[][] array2 = new int[m][2];
		for(int i=0;i<m;i++) {
			array2[i][1]=sc.nextInt();
			array2[i][0]=sc.nextInt();
		}
		sc.close();
		Arrays.sort(array2,(a,b)->Integer.compare(a[0],b[0]));
		int temp=0,now1=n-1,now2=m-1;
		long ans=0;
		while(temp<n) {
			if(now2<0 || array.get(now1)>array2[now2][0]) {
				ans+=array.get(now1);
				now1--;
			}else {
				ans+=array2[now2][0];
				array2[now2][1]--;
				if(array2[now2][1]==0)  now2--;
			}
			temp++;
		}
		System.out.println(ans);
	}
}