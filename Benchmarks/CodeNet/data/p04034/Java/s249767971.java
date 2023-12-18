import java.util.*;
class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int[] c = new int[a];
		int[] d = new int[a];
				
		for (int i = 0 ; i < b ; i++){
		 	c[i] = sc.nextInt() - 1;
		 	d[i] = sc.nextInt() - 1;
		 }      
		
		boolean[] e = new boolean[a];
		int[] f = new int[a];
		
		e[0] = true;
		
		for(int j = 0 ; j < a; j++){
			f[j] = 1;
		}
		
		for(int k = 0 ; k < b; k++){
			if (e[c[k]] == true)
				e[d[k]] = true;
			
			f[c[k]] -= 1;
			f[d[k]] += 1;
			
			 if (f[c[k]] == 0) 
			 	(e[c[k]]) = false;
		} 
		
		int h = 0;
		for(int l = 0; l < a; l++){
		 	if(e[l])
		 		h++;
		}
		System.out.println(h);
	}
}
