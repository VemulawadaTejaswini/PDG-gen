import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String g ="";

       for(int i= 0;i<(str.length()/2);i++) {
    	   g+="PD";
        }
       if(str.endsWith("P")) {
    	   g += "P";
       }
       else if(str.endsWith("D")) {
    	   g += "D";
       }
       else if(str.length()%2==1){
    	   g += "P";
       }
        sc.close();
        System.out.println(g);

	}
}