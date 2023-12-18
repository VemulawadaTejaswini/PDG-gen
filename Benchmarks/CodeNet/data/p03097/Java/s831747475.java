import java.util.*;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.close();
		int c = a^b;
		int cnt = 0;
		while (c!=0){
          c = c & (c-1);
          cnt++;
        } 
		int times=(2<<(n-1))-1;
		if ((times-cnt)%2!=0)System.out.println("NO");
		else {
			System.out.println("YES");
			c=a^b;
			cnt=0;
			int now=1;
			int res=a;
			System.out.printf("%d ",res);
			while(now<Math.max(a,b)){
				if ((c & now) ==c) {
					cnt++;
					if ((res & now)==res)res=res-c;
					else res=(res|now);	
					System.out.printf("%d ",res);
				}
				if (res==b)break;
				now=now<<1;
			}
			int ch=1;
			for (;cnt<times;cnt++) {
				res=res+ch;
				System.out.printf("%d ",res);
				ch=-1*ch;
			}
		}
	}
	

}
