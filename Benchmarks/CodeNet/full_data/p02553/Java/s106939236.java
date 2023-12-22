import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			
			long a = sc.nextLong();
			long b = sc.nextLong();
			long c = sc.nextLong();
			long d = sc.nextLong();

			long ac=a*c;
			long ad=a*d;
			long bc=b*c;
			long bd=b*d;
			if(ac>ad) {
				if(bc>bd) {
					System.out.println(ac>bc?ac:bc);					
				}else {
					System.out.println(ac>bd?ac:bd);					
				}
			}else {
				if(bc>bd) {
					System.out.println(ad>bc?ad:bc);					
				}else {
					System.out.println(ad>bd?ad:bd);					
				}				
			}
	}	
}