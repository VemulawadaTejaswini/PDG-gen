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
    int width = 0;

    width = a - 2*b;
    if(width <= 0){
        System.out.println(0);
    } else{
        System.out.println(width);
    }

    

    }
}