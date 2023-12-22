import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
       Scanner in = new Scanner(System.in);
       while(in.hasNextInt()) {
	       int a = in.nextInt();
	       char op = in.next().charAt(0);
	       int b = in.nextInt();

	       if(op=='?') return;

	       int ans = 0;
	       if(op == '+') {
		       ans=a+b;
	       } else if(op == '-') {
		       ans=a-b;
	       } else if(op == '*') {
		       ans=a*b;
	       } else if(op == '/') {
		       ans=a/b;
	       }
	       System.out.println(ans);
       }
    }
}