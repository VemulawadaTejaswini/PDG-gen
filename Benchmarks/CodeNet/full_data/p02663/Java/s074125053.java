import java.util.*;
import java.util.function.*;
import java.math.*;
public class Main {
    public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int H1 = s.nextInt();
		int M1 = s.nextInt();
		int H2 = s.nextInt();
		int M2 = s.nextInt();
		int K = s.nextInt();
		
		int bw = (H2-H1)*60 + (M2-M1);
		
		System.out.println(bw-K);
    }
}