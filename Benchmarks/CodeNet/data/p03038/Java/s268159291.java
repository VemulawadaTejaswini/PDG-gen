import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt(),m=sc.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i=0;i<n;i++) array.add(sc.nextInt());
		Collections.sort(array);
		ArrayList<Integer> array2 = new ArrayList<Integer>();
		int count=0;
		for(int i=0;i<m;i++) {
			int b=sc.nextInt(), c=sc.nextInt();
			count+=b;
			for(int j=0;j<b;j++) array2.add(c);
		}
		Collections.sort(array2);
		sc.close();
		int temp=0,now1=n-1,now2=count-1;
		long ans=0;
		while(temp<n) {
			if(now2<0 || array.get(now1)>array2.get(now2)) {
				ans+=array.get(now1);
				now1--;
			}else {
				ans += array2.get(now2);
				now2--;
			}
			temp++;
		}
		System.out.println(ans);
	}
}