import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			long n = sc.nextInt();
			if(n == 0) break;
			long count=0;			
			for(long i=1; i<=n; i++){
				long x = i;
				for(int j=11; j>0; j--) 
					while(x%Math.pow(5,j)==0){count+=j;	x /= Math.pow(5,j);}
			}
			System.out.println(count);
		}
	}

}