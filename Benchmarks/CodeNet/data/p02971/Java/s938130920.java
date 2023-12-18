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
    //Integer max[] = new Integer[n];
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
        for(int j=0;j<n;j++){
          if(i!=j){
            if(a[j]>=m) m = a[j];
          }

        }
        System.out.println(m);

        }
      }
    }
  }
