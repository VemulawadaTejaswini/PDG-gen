import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		while(true){
			a = sc.nextInt();
			b = sc.nextInt();
			if(a==0 && b==0)break;
			
			for(int i=0;i<a;i++){
				for(int j=0;j<b;j++){
					if((i+j)%2 == 0){
							System.out.print("#");
					}else{
						System.out.print(".");
					
					}
					
				}
				System.out.printf("\n");
			}
		}
		
		sc.close();
	}
 
}