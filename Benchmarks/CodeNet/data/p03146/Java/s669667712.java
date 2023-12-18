import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		ArrayList<Integer> al = new ArrayList<Integer>();
		int s = Integer.parseInt(sc.next());
		int yono = 1;
		while(!al.contains(s)){
			al.add(s);
			yono++;
			if(s % 2 == 0) s /= 2;
			else s = 3 * s + 1;
		}
		ou.println(yono);
		ou.flush();
	}
}