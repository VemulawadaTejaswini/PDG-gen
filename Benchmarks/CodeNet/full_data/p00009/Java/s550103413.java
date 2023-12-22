import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			int n = scan.nextInt();
			int count = 2;
			
			if(n==1){
				System.out.println(0);
			}else if(n==3 || n==2){
				System.out.println(1);
			}else{
			
				for(int i=4;i<=n;i++){
					boolean isPrime = true;
					
					if(i%2==0){
						isPrime = false;
					}else{
						for(int j=3; j <= Math.sqrt(i) ; j=j+2){
							if(i%j==0){
								isPrime = false;
							}	
						}
					}
					
					if(isPrime){
						count++;
					}
				}
				
				System.out.println(count);
			}
		}
	}

}