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
        long b = sc.nextLong();
        long n = sc.nextLong();

        int max = 0;
        int hoge = -100;
        long d = n * 1 / 4;

        for(long i = d ; i <= n ; i++){
            hoge = (int)Math.floor(i*a/b) - a*(int)Math.floor(i/b);
            if(max < hoge){
                max = hoge;
                hoge = -100;
            }
        }
        System.out.println(max);



    }
}