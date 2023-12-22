import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args) throws IOException{
    Scanner scan=new Scanner(System.in);

    while(true){

      int n=Integer.parseInt(scan.next());
      int cardA=0;
      int cardB=0;
      int pointA=0;
      int pointB=0;
      for(int i=0;i<n;i++){
        cardA=Integer.parseInt(scan.next());
        cardB=Integer.parseInt(scan.next());
        if(cardA>cardB){
          pointA+=cardA+cardB;
        }else if(cardA<cardB){
          pointB+=cardA+cardB;
        }else{
          pointA+=cardA;
          pointB+=cardB;
        }
      }
      System.out.println(pointA+" "+pointB);
    }
  }
}
