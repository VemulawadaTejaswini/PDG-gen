import java.util.*;
public class Main
{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		long H = sc.nextInt();
		long W = sc.nextInt();
		
		
		long i;
		long j;
		int k;
		
		long part[] = new long[3];
		
		long maxpart=0;
		long minpart=10000000;
		
		long area[] = new long[3];
		
		long subarea = 100000000;
		
		for(i=1;i<H+1;i++){
			area[0]=i*W;
			
			for(j=1; j<3; j++){
				maxpart=0;
				minpart=100000000;
				
				if(j==1){
					area[1]=W*(H-i)/2;
					area[2]=W*(H-i-(H-i)/2);
				}
				if(j==2){
					area[1]=(H-i)*(W/2);
					area[2]=(H-i)*(W-(W/2));
				}
				for(k=0; k<3; k++){
					if(area[k]>maxpart){
						maxpart=area[k];
					}
					if(area[k]<minpart){
						minpart=area[k];
					}
				}
				if(maxpart-minpart<subarea){
					subarea=maxpart-minpart;
				}			
			}
		}
		

		
			System.out.println(subarea);

	}
}