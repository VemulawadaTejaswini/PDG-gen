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

    if(a >= b && a >= c){
        if(a == b + c){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }else if(b >= a && b >= c){
        if(b == a + c){
            System.out.println("Yes");
        }else{
            Sytem.out.println("No");
        }
    }else{
        if(c == a + b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }


    


    
    


    
	}
}