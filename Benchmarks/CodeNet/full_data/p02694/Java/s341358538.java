import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    long x =sc.nextLong();
    int y=1;
    long z =100;
    long w=1
    while(y!=0){
      z=z*101/100;
      if(z>=x){y=y+1;}
      else{
        w=w+1;}}
    System.out.ptintln(w);
  }
}