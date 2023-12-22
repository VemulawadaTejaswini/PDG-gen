import java.util.*;

class Main{

  public static void main(String args[]){

    Scanner s=new Scanner(System.in);
    long A=s.nextLong();
    double B=s.nextDouble();
    long rounded=(long)Math.floor(A*B);
    System.out.println(rounded);
  }  
}