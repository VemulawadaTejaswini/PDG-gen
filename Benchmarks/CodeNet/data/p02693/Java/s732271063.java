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

        int k = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;
        for(int i = 0; i < 1000 ; i++){
            if(k * i > a && k * i < b){
                count++;
            }
        }
        if(count > 0){
            System.out.println("OK");
        }else{
            System.out.println("NG");
        }

        
        






    }
}