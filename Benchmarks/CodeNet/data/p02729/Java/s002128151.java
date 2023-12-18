import java.util.*;
import java.io.*;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		long n  =sc.nextLong();
		long m = sc.nextLong();
		long a1 = ((n)*(n-1))/2;
		long a2 = ((m)*(m-1))/2;
		System.out.println(a1+a2);
	}
}