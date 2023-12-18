import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext()){
			int k=sc.nextInt(),t=sc.nextInt();
			int[] a=new int[t];
			for(int i=0;i<t;i++) a[i]=sc.nextInt();
			Arrays.sort(a);
			int ans=0,bf=t-1; a[t-1]--;
			for(int i=0;i<k-1;i++){
				int m1=-1,m2=-1;
				for(int j=0;j<t;j++){
					if(a[j]<=0) continue;
					if(m1==-1 || a[j]>a[m1]) m1=j;
					if(m2==-1 || a[j]>a[m2] && j!=bf) m2=j;
				}
				if(m1!=bf){
					a[m1]--;
					bf=m1;
				}
				else if(m2!=bf){
					a[m2]--;
					bf=m2;
				}
				else{
					ans++;
					a[m1]--;
					bf=m1;
				}
			}
			for(int i=0;i<t;i++) ans+=a[i];
			System.out.println(ans);
		}
	}
}