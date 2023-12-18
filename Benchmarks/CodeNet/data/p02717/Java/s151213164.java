import java.util.*;
public class Main {// Main
    public static void main(String[] args){
     
      Scanner input=new Scanner(System.in);
      int a=input.nextInt();
      int b=input.nextInt();
      int c=input.nextInt();
      
      int temp=a;
      a=b;
      b=temp;
      c=temp;
      a=c;
      
    }
}