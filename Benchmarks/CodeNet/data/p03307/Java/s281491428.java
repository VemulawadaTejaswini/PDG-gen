import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int answer = 0;
    if(n==1){
      answer = 2;
    }else if(n%2==0){
      answer = n;
    }else{
      answer = n*2;
    }
    System.out.println(answer);
  }
  

  
}