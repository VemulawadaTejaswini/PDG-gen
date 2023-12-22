
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int h = 0;
		int jikan = 0;
		int fun = 0;
		int nokori = 0;
		int amari = 0;
		int m = 0;
		int se = 0;
		Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int S = Integer.parseInt(s);
        h = S/3600;
        jikan = h*3600;
        nokori = S - jikan;
        m = nokori/60;
       fun = m*60;
       int  hiku  = 0;
       hiku = fun+jikan;
       amari = S - hiku;
        se = amari;
        System.out.print(h);
        System.out.print(":" + m);
        System.out.println(":" + se);
		
	}
}