import java.util.*;

public class Snuke{
	int N;
	public static void main(String[]args) {
		 Snuke p = new Snuke();
		 p.run();
	}

	public void run() {
		N = reader.nextInt();
		if(N%10==3)
			System.out.print("bon");
		if(N%10==0||N%10==1||N%10==6||N%10==8)
			System.out.print("pon");
		else
			System.out.print("hon");
	}
}
