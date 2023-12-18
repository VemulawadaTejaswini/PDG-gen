import java.io.*;
import java.util.*;
import java.util.ArrayList;
 
class Main
{
  public static void main (String[] arg)
  {
    Scanner scan = new Scanner(System.in);
    
    int N = Integer.parseInt(scan.next()); //整数    
    int A = Integer.parseInt(scan.next()); //整数    蒼
    int B = Integer.parseInt(scan.next()); //整数　　赤
    
    if(A == 0 && B == 0){
      System.out.println(0);
    }
    
    else{
      
      double result = Math.pow(10, 100);
      
      int aaa = (int)result;
      
      int bbb = (A+B) * aaa;
      
      

    String[] arr = new String[bbb];
    
    int count = 0; //配列の数
    
    for(int i = 0;i < 1000;i++){
      
      for(int j = 0;j < A;j++){ 
        arr[count] = "b";
        count++;
      }
      for(int j = 0;j < B;j++){ 
        arr[count] = "r";
        count++;
      }
        
    }
    
    int count_b = 0; //青の数
    for(int i = 0;i < N;i++){ 
        if(arr[i] == "b"){
          count_b++;
      }
    }
    System.out.println(count_b);
    }
  }
}