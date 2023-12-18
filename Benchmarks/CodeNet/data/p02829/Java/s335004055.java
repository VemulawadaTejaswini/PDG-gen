import java.util.*;

public class Main{
  public static void main(String[] args){
    
    Scanner sc=new Scanner(System.in);
    int A=sc.nextInt();
    int B=sc.nextInt();
    int C=0;
    
    if(((A==1)||(A==2))&&((B==1)||(B==2))){
      C=3;
    }
    if(((A==1)||(A==3))&&((B==1)||(B==3))){
      C=2;
    }
    if(((A==3)||(A==2))&&((B==3)||(B==2))){
      C=1;
    }
    
    System.out.println(C);
  }
}