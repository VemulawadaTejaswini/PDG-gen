import java.util.*;
public class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,x,c;
		int max=0,maxn=0;
		int s=sc.nextInt();
		int o=sc.nextInt();
		
		int [][]sn = new int [s][2];
		int []ol = new int [o];

		for(i=0;i<s;i++){
			int m=sc.nextInt();
			sn[i][0]=m;
			sn[i][1]=0;
			System.out.printf("sn %d\n",sn[i][0]);
		}
		
		for(i=0;i<o;i++){
			int e=sc.nextInt();
			ol[i]=e;
			System.out.printf("ol %d\n",ol[i]);
		}
		
		
		for(i=0;i<o;i++){
			for(j=0;j<s;j++){
				System.out.println("d");
				if(ol[i]>=sn[j][0]) {
					sn[j][1]++;
					System.out.printf("vsn %d vn %d vn %d\n",i,sn[i][0],sn[i][1]);
					break;
				}
			}
		}
		
		for(i=0;i<s;i++){
			if(sn[i][1]>max) {
				max=sn[i][1];
				maxn=i+1;
			}
		}
		
		System.out.printf("%d\n",maxn);
		sc.close();
		System.exit(0);
	}
}