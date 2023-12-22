import java.io.*;
 
class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader read = new BufferedReader(new java.io.InputStreamReader(System.in));
        double x = Integer.parseInt(read.readLine());
    	double n = 2*Math.PI*x;
    	double z = Math.PI*x*x;
        System.out.printf("%.6f",n);
    	System.out.println(" ");
    	System.out.printf("%.6f",z);
    }
}