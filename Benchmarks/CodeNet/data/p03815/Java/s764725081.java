import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		long x = Long.parseLong(sc.next());
		sc.close();
		long sum = x / 11 * 2;
		x %= 11;
		if(x > 0){
			sum++;
			x -= 6;
		}
		if(x > 0){
			x -= 5;
			sum++;
		}
		ou.println(sum);
		ou.flush();
    }
}