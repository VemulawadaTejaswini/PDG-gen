import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Main {
	public static void main(final String[] args){
    
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        while(a > 0 && c > 0){
            c -= b;
            a -= d;
        }

        if(c <= 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

        
        
        

        






    }
}