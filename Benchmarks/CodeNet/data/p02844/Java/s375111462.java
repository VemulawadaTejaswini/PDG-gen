import java.util.Scanner;
public class Main{
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	int N=sc.nextInt();
	long S=sc.nextLong();
	long[] S2=new long[N];
	for(int i=N-1;i>=0;i--) {
		S2[i]=(S%10);
		S/=10;
	}
	long[] hash=new long[1000];
	int karinum=0;
	int ans=0;
	for(int i=0;i<N-2;i++) {
		for(int j=i+1;j<N-1;j++) {
			for(int k=j+1;k<N;k++) {
				karinum=(int) (S2[i]*100+S2[j]*10+S2[k]);
				if(hash[karinum]==1) {
					continue;
				}else {
					ans++;
					hash[karinum]=1;
				}
			}
		}
	}
	System.out.println(ans);
}
}