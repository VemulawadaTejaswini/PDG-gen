import java.util.*;
class Main{
  public static void main(String[] a){
    Scanner scan = new Scanner(System.in);
    int i=5;
    while(i-->0){
      if(scan.nextInt()==0){
        System.out.print(i);
      }
    }
  }
    