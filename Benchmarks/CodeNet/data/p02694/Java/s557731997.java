import java.util.*;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    double x = sc.nextLong();
    double n=100;
    int i=1;
    for(i=0;n<x;i++){
      n=n*1.01;
    }
    pl(i+"");
  }

  public static int aa(int n){
    if(n>0){return 1;}
    return 0;
  }

  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
}
