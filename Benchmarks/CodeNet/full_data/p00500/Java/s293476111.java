import java.util.*;
public class AOJ0577{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i,j,k,x,c;
		int p=sc.nextInt();
		int [][]ps =new int[p][3];

		for(i=0;i<p;i++){
			for(j=0;j<3;j++){
				int s=sc.nextInt();
				ps[i][j]=s;
			}
		}
		
		int [][]sf = new int[p][3];
		
		for(i=0;i<p;i++){
			for(j=0;j<3;j++){
				sf[i][j]=ps[i][j];
			}
		}
		
		for(i=0;i<3;i++){
			for(j=0;j<p;j++){
				for(k=(j+1);k<p;k++){
					
					if(ps[j][i]==ps[k][i]){
						sf[j][i]=0;
						sf[k][i]=0;
					}
					
				}
			}
		}
		
		
		for(i=0;i<p;i++){
			for(j=1;j<3;j++){
				sf[i][0]=sf[i][0]+sf[i][j];
			}
			System.out.printf("%d\n",sf[i][0]);
		}
		
		
		sc.close();
		System.exit(0);
	}
}