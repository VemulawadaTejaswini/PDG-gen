import java.io.*;
import java.util.*;
import java.lang.*;

class Main{
  public static void main(String[] args)throws IOException{
    Scanner scan=new Scanner(System.in);
    int r=Integer.parseInt(scan.next());
    int c=Integer.parseInt(scan.next());
    int[][] array=new int[r][c];
    for(int i=0;i<array.length;i++){
      for(int j=0;j<array.length;j++){
        array[i][j]=Integer.parseInt(scan.next());
      }
    }

    int[][] newArray=new int[r+1][c+1];
    for(int i=0;i<r;i++){
      System.arraycopy(array[i],0,newArray[i],0,array[i].length);
    }
    for(int i=0;i<r;i++){
      for(int j=0;j<c;j++){
        newArray[i][c]+=array[i][j];
      }
    }
    for(int i=0;i<c;i++){
      for(int j=0;i<r;j++){
        newArray[r][i]+=array[j][i];
      }
    }

    for(int i=0;i<c-1;i++){
      newArray[r][c]+=newArray[r][i];
    }

    for(int i=0;i<r+1;i++){
      for(int j=0;j<c+1;j++){
        System.out.print(newArray[i][j]);
        if(j<c-1){
          System.out.print(" ");
        }else {
          System.out.println();
        }
      }
    }
  }
}
