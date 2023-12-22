public class Main {

	public static void main(String[] args) {
		java.util.Scanner scan = new java.util.Scanner(System.in);
		int m, f, r;
		while(true){
			m = scan.nextInt();
			f = scan.nextInt();
			r = scan.nextInt();
			if(m == -1 && f == -1 && r == -1){
				break;
			}
			if( m == -1 || f == -1){
				System.out.println("F");
			} else if(m + f >= 80){
				System.out.println("A");
			} else if(80 > m + f && m + f >= 65){ 
				System.out.println("B");
			} else if(65 > m + f && m + f >= 50){
				System.out.println("C");
			} else if(50 > m + f && m + f >= 30){
				System.out.println("D");
				if(r >= 50){
					System.out.println("C");
				}
			} else if(30 > m + f){
				System.out.println("F");
			}
		}
	}
}