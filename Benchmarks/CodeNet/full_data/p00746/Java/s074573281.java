import java.util.*;
public class Main {
	int[] dx,dy;
	int n,x,y;
	Scanner stdin=new Scanner(System.in);
	
	void Solve(){
		while(true){
			n=stdin.nextInt();
			if(n==0) break;
			if(n==1){
				System.out.println("1 1");
			
			}else{
				dx=new int [n];
				dy=new int [n];
				
				
				
				for(int i=1;i<n;i++){
					int j=stdin.nextInt();
					int k=stdin.nextInt();
					set(i,j,k);
				}
				
				dx[0]=Integer.MAX_VALUE;
				dy[0]=Integer.MAX_VALUE;
				
				
				Arrays.sort(dx);
				Arrays.sort(dy);
				if(dx[0]*dx[n-2]>0){
					x=dx[n-2]-dx[0]+2;
				}else x=dx[n-2]-dx[0]+1;
				
				if(dy[0]*dy[n-2]>0){
					y=dy[n-2]-dy[0]+2;
				}else y=dy[n-2]-dy[0]+1;
				
				System.out.println(x+" "+y);
			}
		}
	}
	
	void set(int i,int j,int k){
		switch(k){
		case 0:
			dx[i]=dx[j]-1;
			dy[i]=dy[j];
			break;
		case 1:
			dx[i]=dx[j];
			dy[i]=dy[j]-1;
			break;
		case 2:
			dx[i]=dx[j]+1;
			dy[i]=dy[j];
			break;
		case 3:
			dx[i]=dx[j];
			dy[i]=dy[j]+1;
			break;
			
			
	
		}
		
	}
	
	
	public static void main(String args[]){
		Main m=new Main();
		m.Solve();
	}
	
	
	
}