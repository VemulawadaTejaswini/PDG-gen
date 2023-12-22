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
    List<String> list = new ArrayList<>();
    int count1 = 0;
    int count2 = 0;
    int count3 = 0;
    int count4 = 0;

    for(int i = 0; i < n ; i++){
        list.add(sc.next());
    }

    for(int i = 0; i < n ; i++){
        if(list.get(i).equals("AC")){
            count1++;
        }else if(list.get(i).equals("WA")){
            count2++;
        }else if(list.get(i).equals("TLE")){
            count3++;
        }else{
            count4++;
        }
    }

    System.out.println("AC x "+ count1);
    System.out.println("WA x "+ count2);
    System.out.println("TLE x "+ count3);
    System.out.println("RE x "+ count4);

    

    




    





    
    


    
	}
}