import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int x = sc.nextInt();
    
    int n = sc.nextInt();
    
    Set<Integer> set = new HashSet<>();
    
    for(int i=0;i<n;i++){
      set.add(sc.nextInt());
    }
    
    int dist = 1;
    while(true){
      int left = x-dist;
      int right = x+dist;
      
      if(!set.contains(left)){
        System.out.println(left);
        break;
      } else if(!set.contains(right)){
        System.out.println(right);
        break;
      }
      dist++;
    }
  }
}
