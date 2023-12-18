import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    String s = sc.next();
    char p[] = s.toCharArray();
    int flag = 0;
    for(int i = 0;i < a;i++){
      if(p[i] < '0' || p[i] > '9'){
        flag = 1;
      }
    }
    if(p[a] != '-'){
      flag = 1;
    }
    for(int i = a + 1;i <= a + b;i++){
      if(p[i] < '0' || p[i] > '9'){
        flag = 1;
      }
    }
    if(flag == 0){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}