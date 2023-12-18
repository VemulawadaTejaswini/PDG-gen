import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
   int x=sc.nextInt(),a=sc.nextInt(),b=sc.nextInt();
    String taste="";
    if(b<=a){
      taste="delicious";
    }else if(a+x>=b){
      taste="safe";
    }else{
      taste="dangerous";
    }
    System.out.println(taste);
  }
}