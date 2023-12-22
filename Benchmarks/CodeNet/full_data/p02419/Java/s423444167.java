import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		String t=sc.next();

		while(sc.hasNext()){
			String a=sc.next();
			if(a.equalsIgnoreCase(t)){
				n++;
			}else if(a.equals("END_OF_TEXT")){
				break;
			}
		}
		System.out.println(n);


	}



}
