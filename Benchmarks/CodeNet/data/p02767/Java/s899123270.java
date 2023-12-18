import java.io.BufferedReader;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Collections;

public class Main {
	public static void main(final String[] args){
    
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = 0;
    int minDistance = 0;
    List<Integer> list1 = new ArrayList<>();
    for(int i = 0 ; i < n ; i++){
        list1.add(sc.nextInt());
    }

    for(int i = 0 ; i < n ; i++){
        sum += list1.get(i);
    }
    double sumAve = sum / n;
    Math.round(sumAve);
    int sumAve2 = (int)sumAve;

    for(int i = 0 ; i < n ; i++){
        minDistance += (sumAve2 - list1.get(i)) * (sumAve2 - list1.get(i)); 
    }

    System.out.println(minDistance);
    
    }
}