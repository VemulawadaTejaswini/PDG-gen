import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	long a = sc.nextLong();
	double b = sc.nextDouble();
	sc.close();
	double c = b * 100;
	double d = a * c;
	System.out.println((long)d / 100);
    }
}