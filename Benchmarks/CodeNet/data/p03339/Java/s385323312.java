import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s[] = new String[n];
    String WE = sc.next();
    s = WE.split("");
    int count = 0;
    int min = n;
    for(int i = 0;i < n;i++){
      count = 0;
      for(int j = i - 1;j >= 0;j--){
        if(s[j].equals("W")){
          count++;
        }
      }
      for(int j = i;j < n;j++){
        if(s[j].equals("E")){
          count++;
        }
      }
      if(min > count){
        min = count;
      }
    }
    System.out.println(min);
  }
}