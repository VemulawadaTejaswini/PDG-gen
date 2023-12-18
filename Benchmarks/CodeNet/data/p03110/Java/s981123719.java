import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
      	Double SUM = 0.;
      	int N = s.nextInt();
      	for (int i = 0; i < N; i++){
        	Double M = s.nextDouble();
      		if (s.next().equals("JPY")) SUM += M;
            else SUM += M * 380000.0;
        }
        System.out.println(SUM);
	}
}
