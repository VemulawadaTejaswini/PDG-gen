import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		PrintWriter ou = new PrintWriter(System.out);
		ou.println(Math.abs(Integer.parseInt(sc.next()) * 60 + Integer.parseInt(sc.next()) - Integer.parseInt(sc.next()) * 60 - Integer.parseInt(sc.next())) - Integer.parseInt(sc.next()));
		ou.flush();
	}
}