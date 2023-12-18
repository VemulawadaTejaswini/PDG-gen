import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    if(N%1.08==0){
      System.out.println(N/108*100);
    }else{
      System.out.println(":(");
    }
  }
}