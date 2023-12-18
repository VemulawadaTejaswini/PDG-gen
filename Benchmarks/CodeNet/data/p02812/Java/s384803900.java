import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		char S[] = sc.next().toCharArray();
		int count = 0;
		char ss[] = {'A','B','C'};
		int t=0;
		int ssss=0;
	    int data[] =new int[3];
		for(int i=0;i<N;i++) {
			if(S[i]==ss[t]) {
				data[t]=i;
				System.out.println(t);
				if(t!=0) {
					if(data[t]-data[t-1]==1) {
						t++;
					}else {
						t=0;
					}
				}else {
					t++;
				}
				if(t==3) {
					data[0]=0;
					data[1]=0;
					data[2]=0;
					t=0;
					count++;
				}
			}
		}
		System.out.println(count);
		
	}
}