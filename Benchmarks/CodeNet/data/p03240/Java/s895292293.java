import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int x [] = new int [N];
		int y [] = new int [N];
		int h [] = new int [N];
		
		for (int i=0; i<N; i++){
			x[i]=sc.nextInt();
			y[i]=sc.nextInt();
			h[i]=sc.nextInt();
		}
		
		int H = 0;
	
		int i=0;
		while (h[i]<1){
			i++;
		}
		
		
			
		for (int j=0; j<101; j++){
			for (int l=0; l<101; l++){
				
				H = h[i]+ ver(x[i], j, y[i], l); //i is chosen so that h>0
				boolean check = true;
				
				for (int k=0; k<N; k++){
					int temp = H- ver(x[k], j, y[k], l);
					temp = Math.max(temp, 0);
					
					if (temp!=h[k]){
						check=false;
						break;
					}
				}
				if (check==true)
					System.out.println(j+" "+l+" "+H);
				
			}
		}
		
		
		sc.close();
	}
	public static int ver (int x, int cx, int y, int cy){
		return Math.abs(x-cx)+Math.abs(y-cy);
	}

}