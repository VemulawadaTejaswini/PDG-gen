import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int N=scan.nextInt();
    int l=2;
    int h=N-1;
    while(h-l<=1){
      if(l*h==N){
        break;
      }else if(l*h>N){
        while(l*h>N)h--;
      }else{
        while(l*h>N)l++;
      }
    }
    if(l<=9&&h<=9){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}