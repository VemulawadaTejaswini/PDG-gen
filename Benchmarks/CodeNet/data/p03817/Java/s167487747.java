import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
	Scanner in = new Scanner(System.in);

	long x = in.nextLong();
	long ans = 0;

	if(x < 6){
		ans = 1;
	}
	else if(x <= 11){
		ans = 2;
	}
	else{
		long tmp = x / 11;
		ans = tmp * 2;
		if(x % 11 != 0){
			ans = ans + 1;
		}
	}

	System.out.print(ans);

	}

}