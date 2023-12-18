import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] sList = new int[3];
    int cnt = 0;
    
    for(int i = 0; i<3; i++){
      sList[i] = sc.nextInt();
    }
    
    for(int i : sList){
      if(i == 1){
        cnt++;
      }
    }
    
    System.out.println(cnt);
  }
}