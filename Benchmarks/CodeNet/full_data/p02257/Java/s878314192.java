import java.util.Scanner;

public class Main {

	private static boolean isPrimenum(int i) {
		int max = (int) Math.sqrt(new Double(i));
		for (int j=max;j >1 ;j--){
			if(i%j==0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

		int nx = stdIn.nextInt();
        int [] x = new int[nx];

        for(int i = 0; i < nx; i++){
        	x[i] = stdIn.nextInt();
        }
        stdIn.close();
		int ans=0;
		for (int i = 0; i < nx; i++) {
			if ((0==x[i]%2) && (2 !=x[i])) {
			} else if ((0==x[i]%3) && (3 !=x[i])) {
			} else if (isPrimenum(x[i])){
				ans +=1;
			};
		}

    	System.out.println(ans);
	}
}

