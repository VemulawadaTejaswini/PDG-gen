import java.util.Scanner;

public class Main{
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);

	int A = scan.nextInt();
	int B = scan.nextInt();

	int count = 0;
	for(int i = A; i <= B; i++){
	    String s = String.valueOf(i);
	    if(s.charAt(0) == s.charAt(4) &&
	       s.charAt(1) == s.charAt(3))
		count++;
	}

	System.out.println(count);
    }
}
