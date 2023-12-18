
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Stack;

public class Main{
       
	public static void main(String[] args) {
		
            Scanner sdf = new Scanner(System.in);
            int t=1;
            next: while(t-->0){
                long n=sdf.nextLong();
                long a=sdf.nextLong();
                long b=sdf.nextLong();
               long bb=(n/(a+b))*a ;
               long rem=n%(a+b);
               bb=bb+Math.min(a, rem);
                System.out.println(bb);
            }
        }

        
}