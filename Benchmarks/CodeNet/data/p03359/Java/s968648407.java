import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int manth = Integer.parseInt(sc.next());
    int day = Integer.parseInt(sc.next());
    int takahasi = 0;
    int t;
    if(manth>12) t = 12;
    else t = manth;
    
    for(int i = 1;i <= t;i++){
      for(int j =  1;j <= day;j++){
        if(i == j){
          takahasi++;
        }
      }
    }
    
    System.out.println(takahasi);
  }
}