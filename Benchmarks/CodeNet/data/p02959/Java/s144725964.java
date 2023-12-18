import java.util.*;
import java.io.*;

class Main{
  public static void main(String[] args){
   	Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Integer a[] = new Integer[n+1];
    for(int i=0;i<n+1;i++){
      a[i] = sc.nextInt();
    }
    Integer b[] = new Integer[n];
    for(int i=0;i<n;i++){
      b[i] = sc.nextInt();
    }
    int monster = 0;

    for(int i=0;i<n;i++){
      if(b[i] <= a[i]){
        monster += b[i];
      }else{
        if((b[i]-a[i])<=a[i+1]){
          a[i+1] -=(b[i]-a[i]);
          monster += b[i];
        }else{
          monster += a[i]+a[i+1];
          a[i+1] = 0;
        }
      }
    }
     System.out.println(monster);


   


    }

  }
