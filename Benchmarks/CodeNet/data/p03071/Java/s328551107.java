import java.util.*;
public class Main {
	public static int main(String[] args){
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
      	if (A > B) return 2*A -1;
      	else if (B > A) return 2*B -1;
      	else return A+B;
	}
}