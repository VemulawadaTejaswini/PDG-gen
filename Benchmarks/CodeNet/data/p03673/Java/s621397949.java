import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    ArrayList<Integer> ans = new ArrayList<>();
 
    for(int i = 0; i < n; i++){
      	ans.add(sc.nextInt());
      	Collections.reverse(ans);
    }
    
    for(int i = 0; i < n; i++)
      System.out.printf("%d ", ans.get(i)); 
  }
}