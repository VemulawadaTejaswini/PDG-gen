import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();

    int cnt = 0;   
    
    for(int i=A;i<=B;i++){
      if(i%10 == (i/10000)%10 && (i/10)%10 == (i/1000)%10){
        cnt++; 
      }
    }
    System.out.println(cnt);
  }
}