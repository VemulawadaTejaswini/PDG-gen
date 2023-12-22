import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		int i,j,k,t,m,l;
		Scanner sc=new Scanner(System.in);
		t=Integer.parseInt(sc.next());
		int n[]=new int[t+1];
		int max[]=new int[t+1];
		int Max[]=new int[t+1];
		for(i=0;i<t;i++){
			n[i]=Integer.parseInt(sc.next());
		}
		
		for(i=0;i<t-1;i++){
			for(j=i;j<t-1;j++){
				max[j]=n[j+1]-n[i];
				}
			
			for(j=i;j<t-1;j++){
				m=max[j];
				l=j;
				for(k=j+1;k<t-1;k++){
					if(max[l]<max[k]){
						l=k;
					}
				}
				max[j]=max[l];
				max[l]=m;
				break;
			}
			
			Max[i]=max[i];
		}
		k=0;
		l=0;
		for(i=0;i<t-1;i++){
			m=Max[i];
			
			l=i;
			for(k=i+1;k<t-1;k++){
			if(Max[l]<Max[k]){
				l=k;
			}
			}
			Max[i]=Max[l];
			Max[l]=m;
			break;
		}
	
		
		System.out.println(Max[0]);
	}
}