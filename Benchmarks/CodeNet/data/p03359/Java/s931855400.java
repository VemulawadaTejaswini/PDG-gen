import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int manth = Integer.parseInt(sc.next());
    System.out.println(manth);
    int day = Integer.parseInt(sc.next());
    System.out.println(day);
    int takahasi = 0;
    for(int i = 1;i <= manth;i++){
      for(int j =  1;j <= 31;j++){
        if(i == j){
          takahasi++;
        }
        if(j == day && i == manth) break;
        
      }
    }
    System.out.println(takahasi);
  }
}