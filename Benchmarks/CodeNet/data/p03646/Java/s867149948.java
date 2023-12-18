import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long k=sc.nextLong();
    System.out.println(2);
    if(k%2==0){
      System.out.println(k/2+1+" "+k/2+1);
    }else{
      System.out.println(k/2+" "+k/2+3);
    }
  }
}