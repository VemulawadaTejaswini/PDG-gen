import java.util.Scanner;

public class Main {
	public static void main(String args[]) {

	Scanner std = new Scanner(System.in);


	//List<Integer> list = new ArrayList<>();
	long A = std.nextLong();
	long B = std.nextLong();
	int C = std.nextInt();
	int D = std.nextInt();
	int count = 0;
	long Anew = A;

	//String S = std.next();
	//2以上5以下 4つ、
	for(int i = 0; i < B-A+1; i++) {
		if(Anew%C != 0 && Anew%D != 0) {
			count++;
		}
		Anew ++;
	}

	System.out.println(count);


	  }


	}


