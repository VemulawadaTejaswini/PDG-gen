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
    int m = sc.nextInt();
    int k = sc.nextInt();
    int count = 0;
    int count1 = 0;
    int count2 = 0;

    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();

    for(int i = 0; i < n ; i++){
        list1.add(sc.nextInt());
    }

    for(int i = 0; i < m ; i++){
        list2.add(sc.nextInt());
    }

    for(long i = 0; i < n*m ; i++){

        if(count1 < n){
            if(list1.get(count1) < list2.get(count2)){
                k -= list1.get(count1);
                count1++;
                count++;
            }else{
                k -= list2.get(count2);
                count2++;
                count++;
            }
        }else{
            k -= list2.get(count2);
            count2++;
            count++;
        }
        

        if(k == 0){
            System.out.println(count);
            System.exit(0);
        }else if(k < 0){
            System.out.println(count-1);
            System.exit(0);
        }else{}
    }



    

    
    

    


    
    


    


    
    


    
	}
}