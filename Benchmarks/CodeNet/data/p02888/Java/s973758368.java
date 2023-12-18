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
    List<Integer> list = new ArrayList<>();
    
    for(int i = 0; i < n ; i++){
        list.add(sc.nextInt());
    }
    int count = 0;
    for(int i = 0 ; i < n ; i++){
        for(int j = 0; j < n ; j++){
            for(int k = 0; k < n ; k++){
                if(i < j && j < k){
                    if(list.get(i) < list.get(j) + list.get(k)){
                        if(list.get(j) < list.get(i) + list.get(k)){
                            if(list.get(k) < list.get(j) + list.get(i)){
                                count++;
                            }
                        }
                    }
                }
            }
        }
    }

    System.out.println(count);
    

    }
}