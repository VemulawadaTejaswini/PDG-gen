import java.util.Scanner;
import java.lang.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int[] A = new int[N];
    for(int i=0; i<N; i++){
      A[i] = sc.nextInt();
    }
    sc.close();
    if(!hasAnswer(A)){
      System.out.println("0");
      return;
    }
    int sisu = A.length/2;
    System.out.println((int)(Math.pow(2,sisu)%700000000)); 
  }

  public static boolean hasAnswer(int[] A){
    int maxSize = A.length;
    int count = 0;
    if(A.length%2 == 0){//偶数
      maxSize--;
      while(true){
        if(numCount(maxSize, A)!=2){
          return false;
        }
        maxSize = maxSize-2;
        if(maxSize<0){
          break;
        }
      }
      return true;
    }else{//奇数
      maxSize--;
      while(true){
        if(maxSize == 0){
          if(numCount(maxSize, A)==1){
            break;
          }else{
            return false;
          }
        }
        if(numCount(maxSize, A)!=2){
          return false;
        }
        maxSize = maxSize-2;
        if(maxSize<0){
          break;
        }
      }
      return true;
    }
  }

  public static int numCount(int num, int[] A){
    int count = 0;
    for(int i=0; i<A.length; i++){
      if(A[i] == num){
        count++;
      }
    }
    return count;
  }
}