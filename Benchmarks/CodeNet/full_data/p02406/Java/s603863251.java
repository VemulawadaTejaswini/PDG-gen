import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=1;
		int x;
		while(true){
			x=i;
			if(x%3==0){
				System.out.print(" "+i);
			}else{
				while(true){
					if(x%10==3){
						System.out.print(" "+i);
						break;
					}
					x/=10;
					if(x!=0){
						continue;
					}else{
						break;
					}
				}
			}
			
			if(++i<=n){

			}else{
				System.out.println();
				break;
			}
		}
		scan.close();
	}

}