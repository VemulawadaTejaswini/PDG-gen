import java.util.*;

public class Main {
  static Scanner sc = new Scanner(System.in);
  public static void main(String[] args){
    int A = sc.nextInt();
    Integer[] b = new Integer[A];
    int c=1;
    double d=1000000000000000000;
    for(int i=0; i < A; i++){
      b[i] = sc.nextInt();
      c = c*b[i];
  	}
  	if(c>d){
    	System.out.println(-1);
  	}
  	else{  
   		System.out.println(c);
  	}
  }
}   
