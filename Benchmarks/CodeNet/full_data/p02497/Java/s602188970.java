import java.util.*;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(),b = sc.nextInt(),c = sc.nextInt();
		
		while(a != -1 || b != -1 || c != -1){
			if(a==-1||b==-1){
				System.out.println("F");
			}else if(a+b>=80){
				System.out.println("A");
			}else if(a+b>=65){
				System.out.println("B");
			}else if(a+b>=50){
				System.out.println("C");
			}else if(a+b>=30){
				if(c>=50){
					System.out.println("C");
				}else{
					System.out.println("D");
				}
			}else{
				System.out.println("F");
			}
			a = sc.nextInt();
			b = sc.nextInt();
			c = sc.nextInt();
		}

	}

}