import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);
       int r = in.nextInt();
       System.out.printf("%f %f\n", Math.PI * r * r,
		       		    2 * Math.PI * r);
    }
}