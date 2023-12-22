import java.util.Scanner;
import java.io.*;
import java.lang.Math;

public class Main {
public static void main(String[] args) throws IOException{
	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
 //Scanner sc = new Scanner(System.in);
 int r =Integer.parseInt(in.readLine());
 //int r = sc.nextInt();
 //int r=Integer.parseInt(args[0]);
 double pi = Math.PI;
 double area =r*r*pi;
 double diam= 2*r*pi;
System.out.printf("%.6f %.6f\n",area,diam);
}}