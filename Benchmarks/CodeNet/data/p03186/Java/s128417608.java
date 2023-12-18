import java.util.*;

class Main{
  public static void main(String args[]){
    int a=0,b=0,c=0;
    Scanner s=new Scanner(System.In);
    a=s.nextInt();
    b=s.nextInt();
    c=s.nextInt();
    
    if(c-1<=a+b){
      System.out.println(b+c);
    }else{
      System.out.println(a+b+1+b);
    }
  }
}
    