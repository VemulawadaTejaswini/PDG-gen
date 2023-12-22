import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Main {
 public static void main(String[]args){
  Scanner in = new Scanner(System.in);
   
   int N = in.nextInt();
         for(int i=0; i<N+1; i++){
           String S = in.nextLine();
           List<String> list = new ArrayList<String>();   
           list.add =(S);
         }
           Set<String> uniqueSet = new HashSet<String>(list);
              for (String temp : uniqueSet) {
              System.out.println(temp + ": " + Collections.frequency(list, temp));
    }
        
  }
}