import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args)throws java.lang.NumberFormatException{
    Scanner scan=new Scanner(System.in);
    int[][] cards=new int[4][13];
    int n=Integer.parseInt(scan.next());
    for(int i=0;i<n;i++){
      char design=scan.next().charAt(0);
      int rank=Integer.parseInt(scan.next());
      if(design=='S'){
        cards[0][rank-1]=1;
      }else if(design=='H'){
        cards[1][rank-1]=1;
      }else if(design=='C'){
        cards[2][rank-1]=1;
      }else if(design=='D'){
        cards[3][rank-1]=1;
      }
    }
    System.out.println();

    for(int i=0;i<cards.length;i++){
      for(int j=0;j<cards[i].length;j++){
        if(cards[i][j]==0){
          if(i==0){
            System.out.println("S "+(j+1));
          }else if(i==1){
            System.out.println("H "+(j+1));
          }else if(i==2){
            System.out.println("C "+(j+1));
          }else if(i==3){
            System.out.println("D "+(j+1));
          }
        }
      }
    }
  }
}
