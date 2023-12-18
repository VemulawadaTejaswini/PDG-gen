import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        long x = scan.nextLong();
        long taka = 100;
        long years = 0;
        
        while(taka<x) {
        	years++;
        	taka*=1.01;
        }

		System.out.println(years);
	    scan.close();	
    }
}