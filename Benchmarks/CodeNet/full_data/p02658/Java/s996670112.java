import java.util.*;
class Main{
public static void  main(String[] args){
Scanner sc=new Scanner(System.in);
  
  int A= sc.nextInt();
  long result=0;
  long x=1;
  for(int i=0;i<A;i++){
  long y=sc.nextInt();
    x*=y;
    if(x>1000000000000000000){
    result=0;
      break;
    }
    else{
    
    result=x;}
  
  }
  
  System.out.println(result);

}


}
