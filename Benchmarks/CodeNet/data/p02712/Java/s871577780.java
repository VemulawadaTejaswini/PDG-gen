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
    int n = sc.nextInt();
    long sum = 0;
    
    for(int i = 1 ; i < n + 1 ; i++){
        if(i % 3== 0 && i % 5 == 0){

        }else if(i % 3 == 0){

        }else if(i % 5 == 0){

        }else{
            sum += i;
        }
    
    }
    
    System.out.println(sum);
}
}