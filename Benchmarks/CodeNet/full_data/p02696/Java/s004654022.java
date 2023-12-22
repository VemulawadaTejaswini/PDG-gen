import java.util.*;
public class Main{

  
  public static void main(String[] args){
  
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int k=s.nextInt();
    int ss=s.nextInt();
    if(ss<k){
    	System.out.println(Math.floor(ss*n/k ));
    }
    else{
    	System.out.println((int)Math.floor((k-1)*n/k ));
    }
  
  }
  
}