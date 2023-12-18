import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double n = sc.nextDouble();
    double answer =0;
    if(n%2==0){
      answer = 0.5;
    }else{
      answer = (n+1)/(2*n);
    }
    
    System.out.println(answer);
  }
  

  
}