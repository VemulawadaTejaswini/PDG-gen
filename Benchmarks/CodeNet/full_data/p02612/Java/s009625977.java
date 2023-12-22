import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a = sc.nextInt();
    for(int i=1; i<=10; i++){
      if(a<=1000*i) {
        System.out.println(1000*i);
        break;
      }
    }
  }
}