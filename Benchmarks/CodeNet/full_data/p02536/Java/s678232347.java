import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
	public static void main(final String[] args){
    
    final Scanner sc = new Scanner(System.in);
    final List<Integer> list = new ArrayList<>();
    final List<Integer> list2 = new ArrayList<>();
    //final List<Long> list3 = new ArrayList<>();

    int n = sc.nextInt();
    int m = sc.nextInt();
    int check = 1;
    int count = 0;

    for(int i = 0 ; i < m ; i++){
        list.add(sc.nextInt());
        list2.add(sc.nextInt());
    }

    list.addAll(list2);
    List<Integer> listB = new ArrayList<Integer>(new HashSet<>(list));
    Collections.sort(listB);

    //System.out.println(listB);

    for(int i = 0 ; i < listB.size() - 1; i++){
        if(listB.get(i + 1) - listB.get(i) == 1){
        }else{
            count += listB.get(i + 1) - listB.get(i) - 1;
        }
    }
    count += n - listB.get(listB.size() - 1);

    System.out.println(count);



   






    

   

    

    




    







}
}