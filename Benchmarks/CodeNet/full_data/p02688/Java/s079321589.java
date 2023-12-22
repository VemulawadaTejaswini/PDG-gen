import java.util.*;

public class Main{
	public static void main(String arga[]){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int c = sc.nextInt();
		
		int[] b = new int[a];
		int[] d = new int[c];
		
		int ans =0;
		
		
		boolean[] z = new boolean[a];
		
		for(int i= 0;i<c;i++){
			d[i] = sc.nextInt();
			
			for(int n=0;n<d[i];n++){
				b[n] = sc.nextInt();
				z[b[n]] = true;
			}
		}
		
		
		 for(int j = 0; j < a; j++) {
        	if(z[j] == false) ans++; 
        }
		System.out.println(ans);
		
	}
}

	
		