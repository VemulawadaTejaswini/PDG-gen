import java.util.Scanner;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String inputnumber = sc.nextLine();
      	String[] inputlist = inputnumber.split(" ", 0);
      	int A = Integer.parseInt(inputlist[0]);
      	int B = Integer.parseInt(inputlist[1]);
      	int C = Integer.parseInt(inputlist[2]);
      	int K = Integer.parseInt(inputlist[3]);
		int sumnumber = 0;      
      	if (K <= A){
          	sumnumber = A;
        } else if (K <= A + B) {
          	sumnumber = A;
        } else {
          	sumnumber = A - (K - A -B);
        }
      	System.out.println(sumnumber);
        
	}
 
}