import java.util.Scanner;

public class Main {

public static void main(String args[]) {
	Scanner s = new Scanner(System.in);
	int a =s.nextInt();
	int b= s.nextInt();
	int c = s.nextInt();
	if(a<b&&b<c) System.out.println("Yes");
	else System.out.println("No");
	s.close();
}


}

