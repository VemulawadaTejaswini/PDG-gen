import java.util.Scanner;

public class Main {

	public static int answer = 0;
	public static int N = 0;
	public static long [] a;

	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);

	    N = scanner.nextInt();
	    a = new long[N];
	    for(int i = 0;i < N;i++){
	    	a[i] = scanner.nextInt();
	    }

	    operate();

	    System.out.println(answer);

	    scanner.close();
    }

	public static void operate(){
		boolean check = false;
		long maxeven = -2;
		int maxevenpos = -1;


		for(int i = 0;i < N;i++){
	    	if(a[i]%2 == 0) {
	    		if(maxeven < a[i]) {
	    			maxeven = a[i];
	    			maxevenpos = i;
	    		}
	    		check = true;
	    	}
	    }
		if(check){
			answer++;
			for(int j = 0;j < N; j++){
				if(j != maxevenpos) a[j] = a[j] * 3;
		    	else a[j] = a[j] / 2;
			}
			operate();
		}
	}

}
