import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    StringBuilder sb = new StringBuilder();
    for(int i=1; i<=n; i++){
      if(i%3==0 || i%10==3 ){
        sb.append(" ").append(i);
      }
      else {
        int j = i;
        while(j>=10) {
          j = j/10;
          if(j%10==3){sb.append(" ").append(i);break;} 
        }
      }
    }
    System.out.println(sb);
  }
}