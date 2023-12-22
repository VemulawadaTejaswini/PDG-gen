import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner scn=new Scanner(System.in);
    int x=scn.nextInt();
    int y=scn.nextInt();
    
    for(int i=0;i<=x;i++){
      for(int j=0;j<=x-i;j++){
        if(i*2+j*4==y){
          System.out.println("Yes");
          return;
        }
      }
    }
    System.out.println("No");
  }
}