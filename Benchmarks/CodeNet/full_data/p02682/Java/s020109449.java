import java.util.*;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt(),k=sc.nextInt();
  if(a>k){
    System.out.println(k);
  }else{
      k-=a;
      if(b>k){
          System.out.println(a);
      }else{
          k-=b;
          System.out.println(a-k);
      }
  }
}
}