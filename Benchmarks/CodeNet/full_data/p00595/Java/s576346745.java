//import java.io.*;
import java.util.*;
//import java.math.*;
public class Main {
 
    public static void main(String[] args) throws java.io.IOException{
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
        	System.out.println(gcd(scan.nextInt(),scan.nextInt()));
        }
    }
    public static int gcd(int a,int b){
    	if(b==0)return a;
    	return gcd(b,a%b);
    }
}