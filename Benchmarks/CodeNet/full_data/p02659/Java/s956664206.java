import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextInt();
	double b = sc.nextDouble();
	sc.close();
	double c = a * b;
	System.out.println((int) c);
    }
}