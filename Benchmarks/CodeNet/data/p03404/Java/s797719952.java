import java.util.*;
import java.io.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int w = Math.max(A,B) * 2;
    int h = 3;
  
    String base = "";
    for(int i=0; i<w; i++){
      if(i%2 ==0){
        base = base + ".";
      }else{
        base=base + "#";
      } 
    }
    String white = "";
    for(int i=0;i<w;i++){
      if(i< w-(A*2)){
        white=white + ".";
      }
    }
    white = white + base.substring(w-A*2,w);
    String black = base.substring(0,B*2);
    for(int i=0;i<w;i++){
      if(2*B-1 < i){
        black = black + "#";
      }
    }
    
    System.out.println(white);
    System.out.println(base);
    System.out.println(black);
  }
}