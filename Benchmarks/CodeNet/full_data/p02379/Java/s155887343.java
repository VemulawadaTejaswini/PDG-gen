import java.util.Scanner;
import java.io.*;

class Main {
    public static void main(String[] args)throws IOException{ 
    	InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader read = new BufferedReader(in);
    	   	                                                 
        String line = read.readLine();
        String [] spli = line.split(" ");
        double x1 = Integer.parseInt(spli[0]);
        double y1 = Integer.parseInt(spli[1]);
        double x2 = Integer.parseInt(spli[2]);
        double y2 = Integer.parseInt(spli[3]);
        double root;

        root = (x2-x1)*(x2-x1)+(y2-y1)*(y2-y1);
        System.out.println(Math.sqrt(root));
    }
}