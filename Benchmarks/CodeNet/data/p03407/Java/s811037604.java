import java.util.*;
import java.io.*;
import java.math.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		if(Integer.parseInt(sc.next()) + Integer.parseInt(sc.next()) >= Integer.parseInt(sc.next())) ou.println("Yes");
		else ou.println("No");
		ou.flush();
	}
}