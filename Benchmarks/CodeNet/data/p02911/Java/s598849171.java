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
        int k = sc.nextInt();
        int q = sc.nextInt();
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

    for(int i = 0; i < q ; i++){
        list.add(sc.nextInt());
    }
    for(int i = 0; i < n ; i++){
        list2.add(k);
    }
    for(int i = 0; i < n ; i++){
        list2.set(i,k-q);
    }
    for(int i = 0; i < q ; i++){
        list2.set(list.get(i)-1,list2.get(list.get(i)-1)+1);
    }



    for(int i = 0; i < n ; i++){
        if(list2.get(i) <= 0){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
    }

    }
}