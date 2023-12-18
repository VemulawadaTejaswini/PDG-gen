import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String bi = Integer.toString(sc.nextInt());
      	int n = Integer.parseInt(bi, 2);
		System.out.println(2*n+1);
	}
}