import java.util.Scanner;

class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
      	
      	String S = sc.next();
      	sc.close();
      
      	String year = S.substring(0, 4);
      	String month = S.substring(5, 7);
      	String day = S.substring(8, 10);
      
      	if (Integer.parseInt(year) >= 2019 && Integer.parseInt(month) >= 5) {
        	System.out.println("TBD");
        } else {
        	System.out.println("Heisei");	
        }
	}
}