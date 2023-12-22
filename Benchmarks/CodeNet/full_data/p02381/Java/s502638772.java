import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    while(true){
    int n = sc.nextInt();
    if(n==0){
      break;
    }
    for(int i=0;i<scores.length;i++){
      scores[i]=sc.nextInt();
    }
    double average=0,variance=0;
    for(i=0;i<n;i++){
      average+=(double)score[i]/n;
      variance+=(double)(scores[i]-average)*(scores[i]-average)/n;
    }
    System.out.println(Math.sqrt(variance));
    }
  }
}