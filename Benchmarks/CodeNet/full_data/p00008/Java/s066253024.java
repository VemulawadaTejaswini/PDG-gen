import java.util.Scanner;

class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int n;
		int i,j,k,l;
		int count;
		
		while(scan.hasNextInt()){
			n = scan.nextInt();
			count = 0;
			
			for(i=0;i<=9;i++){
				for(j=0;j<=9;j++){
					for(k=0;k<=9;k++){
						for(l=0;l<=9;l++){
							if(n == i+j+k+l){
								count++;
							}
						}
					}
				}
			}
			System.out.println(count);
			
		}
		
		scan.close();
	}
}