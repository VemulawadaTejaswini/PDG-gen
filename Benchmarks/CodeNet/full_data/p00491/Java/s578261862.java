import java.util.*;



public class Main {
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		int n = s.nextInt(); 
		int m = s.nextInt();
		int ans = 0;
		
		
		int p[][] = new int[6][n];
		for(int i=0; i<6; i+=2){
			p[i][0] = 1;
		}
		
		int d[] = new int[n];
		
		for(int i=0; i<m; i++){
			d[s.nextInt() - 1] = s.nextInt(); 
		}
		
		if(d[0] == 1){
			for(int k=0; k<6; k++){
				if(k != 0 && k != 1)	p[k][0] = 0;
			}
		}
		else if(d[0] == 2){
			for(int k=0; k<6; k++){
				if(k != 2 && k != 3)	p[k][0] = 0;
			}
		}
		else if(d[0] == 3){
			for(int k=0; k<6; k++){
				if(k != 4 && k != 5)	p[k][0] = 0;
			}
		}
		
		
		for(int i=1; i<n; i++){
			
			p[0][i] = p[2][i-1] + p[3][i-1] + p[4][i-1] + p[5][i-1];
			p[1][i] = p[0][i-1];
				
			p[2][i] = p[0][i-1] + p[1][i-1] + p[4][i-1] + p[5][i-1];
			p[3][i] = p[2][i-1];
				
			p[4][i] = p[0][i-1] + p[1][i-1] + p[2][i-1] + p[3][i-1];
			p[5][i] = p[4][i-1];
			
			if(d[i] == 1){	
				for(int k=0; k<6; k++){
					if(k != 0 && k != 1)	p[k][i] = 0;
				}
			}
			else if(d[i] == 2){	
				for(int k=0; k<6; k++){
					if(k != 2 && k != 3)	p[k][i] = 0;
				}
			}
			else if(d[i] == 3){	
				for(int k=0; k<6; k++){
					if(k != 4 && k != 5)	p[k][i] = 0;
				}
			}
		}
		
		for(int i=0; i<6; i++)	ans += p[i][n-1];
		System.out.println(ans % 10000);
		
	}

}