import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int box = sc.nextInt();
    
    int[] list = new int[box];
    
    for(int i = 0 ; i < list.length ; ++i){
      list[i] = sc.nextInt();
    }
    
    int intMin = list[0];
    int count = 1;
    for(int i = 1 ; i < list.length ; ++i){
      if(intMin > list[i]){
        intMin = list[i];
        count += 1;
      }
    }
    
    System.out.println(count);
  }
}