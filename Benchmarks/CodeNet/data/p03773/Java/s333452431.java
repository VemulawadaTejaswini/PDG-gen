import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double y = (double)N;
		double ans = Math.sqrt(y);
		int j = (int)ans;
        int valLen = String.valueOf(j).length();
        System.out.println(valLen);    
    }
}