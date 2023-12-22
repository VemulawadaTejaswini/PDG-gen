import java.util.Scanner;

public class Main {

	static int gcd (int x, int y){
		int num=1;
		int max= Math.abs(x-y);
		if(max==0){
			return x;
		}
        for (int i=max; i > 0;i--) {
        	if (((x%i)==0) && ((y%i)==0)){
        		num=i;
        		break;
        	}
        }
		return num;
	}

	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);

        int [] x = new int[2];

        for(int i = 0; i < 2; i++){
        	x[i] = stdIn.nextInt();
        }
        stdIn.close();
        int ans;
        ans = gcd(x[1], x[0]);
        System.out.println(ans);
	}
}

