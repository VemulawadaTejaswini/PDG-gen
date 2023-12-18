import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int pow = sc.nextInt();
        
        int num = 1;
        
        for(int i=1; i<=pow; i++){
            num = num * i;
        }
        
        double ans = num % (Math.pow(10, 9) + 7);
        System.out.println(ans);
    }
}