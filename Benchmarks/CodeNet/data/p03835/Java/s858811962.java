import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int S = sc.nextInt();
    int answer=0;
    for(int i=0;i<=K;i++){
      for(int j=0;j<=K;j++){
        for(int l=0;l<=K;l++){
          if(i+j+l==S){
            answer++;
          }
        }
      }
    }
    System.out.println(answer);
  }
  

  
}