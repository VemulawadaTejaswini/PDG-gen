import java.util.*;

public class Main{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	long N = sc.nextInt();
	long K = sc.nextInt();

	/*
	int N = Integer.parseInt(sc.next());
	int K = Integer.parseInt(sc.next());
	*/

	long x = N;
	long abs = Math.abs(x-K);

	while(abs < x){
	    x = abs;
	    abs = Math.abs(x - K);
	}

	System.out.println(x);

    }
}
