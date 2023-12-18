import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long power = 1;
        for(int i = 1; i <= N; i++){
            power = power * i;
        }
        long x = (long)Math.pow(10, 9);
        System.out.println(power % (x + 7));
	}

}
