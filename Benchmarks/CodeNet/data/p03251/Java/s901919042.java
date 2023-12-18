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
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new ArrayList<>();
    int n = sc.nextInt();
    int m = sc.nextInt();

    int x = sc.nextInt();
    int y = sc.nextInt();

    int max=-100;
    int min=100;


    for(int i = 0; i < n; i++){
        list1.add(sc.nextInt());
    }

    for(int i = 0; i < n ; i++){
        if(list1.get(i) >= max){
            max = list1.get(i);
        }else{}
    }

    for(int i = 0; i < m; i++){
        list2.add(sc.nextInt());
    }

    for(int i = 0; i < m; i++){
        if(list2.get(i) <= min){
            min = list2.get(i);
        }else{}
    }
    if(max >= x && max < min){
        System.out.println("No War");
    }else if(min <= y && max < min){
        System.out.println("No War");
    }else{
        System.out.println("War")
    }




    
    
    
	}
}