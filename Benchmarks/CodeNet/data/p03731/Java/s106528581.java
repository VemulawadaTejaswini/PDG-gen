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
    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    long t = sc.nextLong();
    int count = 0;

    List<Long> list = new ArrayList<>();

    for(int i = 0; i < n ; i++){
        list.add(sc.nextLong());
    }

    for(int i = 0 ; i < n - 1 ; i++){
        if(list.get(i + 1) - list.get(i) > t){
            count += t;
        }else{
            count += list.get(i + 1) - list.get(i);
        }
    }

    count += t;

    System.out.println(count);




    





    
    


    
	}
}