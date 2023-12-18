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
    //int x = sc.nextInt();
    List<String> list = new ArrayList<>();
    int count = 0;
    String str2 = "";
    String str3 = "";
    
    for(int i = 0; i < n ; i++){
        list.add(sc.next());

        
    }

    for(int i = 0; i < n ; i++){
        for(int j = i+1; j < n ; j++){
             //String型をchar型配列に変換
             char[] chars1 = list.get(i).toCharArray();
             char[] chars2 = list.get(j).toCharArray();

             //String型をchar型配列に変換
             Arrays.sort(chars1);
             Arrays.sort(chars2);

             str2 = new String(chars1);
             str3 = new String(chars2);

             if(str2.equals(str3)){
                count++;
            }

        }
    }


    System.out.println(count);

    


    


    

    
    
    



    





}
}