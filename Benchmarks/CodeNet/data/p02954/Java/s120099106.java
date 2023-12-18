import java.util.*;
public class Main{
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		sc.close();
		int R[]=new int[S.length()];
		int StopR[]=new int[S.length()];
		int num=0;
		int distance=0;
		int stop=0;
		for(int i=0;i<S.length();i++) {
			R[i]=0;
		}
		for(int n=0;n<(S.length()-1);n++) {
			if(S.charAt(n)=='R'&&S.charAt(n+1)=='L') {
				StopR[num]=n;
				num++;
			}
		}
		for(int j=0;j<S.length();j++) {
			if(S.charAt(j)=='L') {
				distance=j-StopR[0];
				stop=0;
				for(int k=1;j>=StopR[k];k++) {
					if(distance>j-StopR[k]) {
						distance=j-StopR[k];
						stop=k;
						}
					}
			}else {
				distance=StopR[num-1]-j;
				stop=num-1;
				for(int l=num-2;StopR[l]>=j;l--) {
					if(distance>StopR[l]-j) {
						distance=StopR[l]-j;
						stop=l;
						}
					}
				}
			}
			if(distance%2==0) {
				R[StopR[stop]]+=1;
			}else {
				R[StopR[stop]+1]+=1;
			}
		for(int m=0;m<S.length();m++) {
			System.out.print(R[m]+" ");
		}
	}
}