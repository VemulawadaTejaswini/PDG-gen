  import java.util.*;
  class Main{
      public static void main(String[] args){
      Scanner stdIn = new Scanner(System.in);
          int N = stdIn.nextInt();
          if(N%2==0){
              System.out.println(N);
          }else{
            System.out.println(N*2);
          }
      }
  }