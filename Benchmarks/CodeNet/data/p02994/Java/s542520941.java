import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int l = sc.nextInt();
    int Sum;
    
    if(l>=0){
      Sum = l;
      for(int i=0;i<n-1;i++){
        Sum++;
      }
    }else{
      Sum = l;
      for(int i=0;i<n-1;i++){
        Sum = Sum + l + 1;
      }
    }
    System.out.println(Sum);
  }
}