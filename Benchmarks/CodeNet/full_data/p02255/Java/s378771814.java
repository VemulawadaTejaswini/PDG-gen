import java.io.*;
import java.util.*;

class Main{
  public static void main(String[] args) throws IOException{

    Scanner scan=new Scanner(System.in);
    int n=Integer.parseInt(scan.next());
    int[] array=new int[n];
    for(int i=0;i<array.length;i++){
      array[i]=Integer.parseInt(scan.next());
    }

    for(int k=0;k<array.length;k++){
      if(k<array.length-1){
        System.out.print(array[k]);
        System.out.print(" ");
      }else{
        System.out.println(array[k]);
      }
    }

    //ソート
    for (int j = 1; j < array.length; j++) {
            int key = array[j];
            int i = j - 1;
            while (i >= 0 && array[i] > key) {
                array[i + 1] = array[i];
                i--;
            }
            array[i + 1] = key;
            for(int k=0;k<array.length;k++){
              if(k<array.length-1){
                System.out.print(array[k]);
                System.out.print(" ");
              }else{
                System.out.println(array[k]);
              }
            }
        }
  }
}

