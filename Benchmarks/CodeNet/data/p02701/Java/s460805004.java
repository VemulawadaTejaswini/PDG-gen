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
        List<String> list = new ArrayList<>();
        int count = 1;

        for(int i = 0 ; i < n ; i++){
            list.add(sc.next());
        }

        Collections.sort(list);

        for(int i = 0 ; i < n - 1 ; i++){
            if(list.get(i).equals(list.get(i+1))){
            }else{
                count++;
            }
        }

        System.out.println(count);
        
        
        

        






    }
}