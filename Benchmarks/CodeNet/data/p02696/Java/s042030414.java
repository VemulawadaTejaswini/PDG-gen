import java.util.*;
class Main {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
    long A = sc.nextLong(); //next(文字列), nextDouble, nextLine(1行)とか
    long B = sc.nextLong(); //next(文字列), nextDouble, nextLine(1行)とか
    long N = sc.nextLong(); //next(文字列), nextDouble, nextLine(1行)とか
  
    long max = 0;
    if(B%N != 0){
      System.out.println((A*N)/B - A*(N/B));      
    }else{
      max = Math.max(((A*N)/B - A*(N/B)),((A*(N-1))%B - A*((N-1)%B)));
      max = Math.max(max,((A*(N-2))/B - A*((N-2)/B)));
    System.out.println(max);
    }        
  }
}
