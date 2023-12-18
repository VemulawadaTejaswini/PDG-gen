import java.util.*;
import java.io.*;


class Main {
  public static void main(String[] args){
    Scanner  sc = new Scanner(System.in);
    int n = sc.nextInt();
    Integer a[] = new Integer[n];
    for(int i=0;i<n;i++){
      a[i] = sc.nextInt();
    }
   
    int max = 0;
    int m = 0;


    for(int i=0;i<n;i++){
      if(a[i]>=max){
        max = a[i];

      }
    }
    for(int i=0;i<n;i++){

      if(a[i]<max){
        System.out.println(max);
      }else{
        System.out.println(a[i]);

        }
      }
    }


   



  }
