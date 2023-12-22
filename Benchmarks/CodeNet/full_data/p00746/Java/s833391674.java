import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int exit=0;
		
		while(exit==0){
			int m = sc.nextInt();
			if(m==0)exit=1;
			if(exit==0){
				int[] x = new int[m];
				int[] y = new int[m];
				x[0] = 0;
				y[0] = 0;
				
				for(int i=1;i<m;i++){
					int a = sc.nextInt();
					int b = sc.nextInt();
					if(b==0){
						x[i]=x[a]-1;
						y[i]=y[a];
					}else if(b==1){
						x[i]=x[a];
						y[i]=y[a]+1;
					}else if(b==2){
						x[i]=x[a]+1;
						y[i]=y[a];
					}else if(b==3){
						x[i]=x[a];
						y[i]=y[a]-1;
					}					
				}
				
				Arrays.sort(x);
				Arrays.sort(y);
				
				System.out.println((x[m-1]-x[0]+1) + " " + (y[m-1]-y[0]+1));
				
			}
		}
	}
	
}