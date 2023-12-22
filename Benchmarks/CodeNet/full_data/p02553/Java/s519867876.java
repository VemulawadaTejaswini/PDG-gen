public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			int d = sc.nextInt();

			double ac=a*c;
			double ad=a*d;
			double bc=b*c;
			double bd=b*d;
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