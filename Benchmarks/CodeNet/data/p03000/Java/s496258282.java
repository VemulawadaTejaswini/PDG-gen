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
    
    final Scanner sc = new Scanner(System.in);
    final List<Integer> list = new ArrayList<>();
    //final List<Long> list2 = new ArrayList<>();

    int n = sc.nextInt();
    int x = sc.nextInt();
    int jump = 0;
    int count = 1;

    for(int i = 0; i < n ; i++){
        list.add(sc.nextInt());
    }

    for(int i = 0 ; i < n ; i++){
        jump += list.get(i);
        if(jump > x){
            System.out.println(count);
            System.exit(1);
        }
        count++;
    }



   
    





}
}