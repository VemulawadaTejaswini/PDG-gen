import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] sList = new int[3];
    int cnt = 0;
    
    sList[0] = sc.nextInt();
    sList[1] = sc.nextInt();
    sList[2] = sc.nextInt();
    
    for(int i : sList){
      if(i == 1){
        cnt++;
      }else{
      }
    }
    
    System.out.println(cnt);
  }
}
