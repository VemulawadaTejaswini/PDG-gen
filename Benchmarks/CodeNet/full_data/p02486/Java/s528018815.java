import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n,x;
		int i,j,k;
		
		while(true){
			n = sc.nextInt();
			x = sc.nextInt();
			if(n==0 && x==0) break;
			
			int counter=0;
			
			for(i=1; i<=n-2; i++)
				for(j=i+1; j<=n-1; j++)
					for(k=j+1; k<=n; k++){
						if(i+j+k==x) counter++;
					}
					
			System.out.println(counter);
			
		}
			

	
	}
}