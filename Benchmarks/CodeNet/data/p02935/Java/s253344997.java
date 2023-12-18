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
    List<Double> list = new ArrayList<>();
    int n = sc.nextInt();
    double sum = 0;
    double maker = 0;

    for(int i = 0 ; i < n ; i++){
        list.add(sc.nextDouble());
    }

    Collections.sort(list);
    maker = (list.get(0) + list.get(1) ) / 2;

    if(list.size() <= 2){
        System.out.println(maker);
    }else{
        for(int i = 2 ; i < n; i++){
            maker = (maker + list.get(i)) / 2;
        }
        System.out.println(maker);
    }
    






    
    
    







}
}