import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
      	int max = 1;
      	for(int i=2; i*i<=x; i++){
          int num = i;
          while (num <= x) {
				num *= i;
			}
			num /= i;
			max = Math.max(max, num);
        }
      	System.out.println(max);
	}
}
