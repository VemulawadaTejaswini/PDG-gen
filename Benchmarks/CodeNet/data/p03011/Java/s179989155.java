import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;

public class Main {
	public static void main(final String[] args){
    
    final Scanner sc = new Scanner(System.in);
    //final List<Integer> list = new ArrayList<>();
    //final List<Long> list2 = new ArrayList<>();

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int a2 = a + b;
    int b2 = b + c;
    int c2 = c + a;

    if(a2 < b2 && a2 < c2){
        System.out.println(a);
    }else if (b2 < a2 && b2 < c2){
        System.out.println(b);
    }else{
        System.out.println(c);
    }



    



   
    





}
}