import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  
  int i=0,j=0;
  int[] ans=new int[10000];
  String op=" "; 
   
  while(!(op.equals("?"))){
   
  int a=sc.nextInt();
  op=sc.next();
  int b=sc.nextInt();

  if(op.equals("+")) {
  ans[i]= a + b;
  }else if(op.equals("-")){
  ans[i]= a - b;
  }else if(op.equals("*")){
  ans[i]= a * b;
  }else if(op.equals("/")){
  ans[i]= a / b;
  }
  i++;
  }

  while(j<i-1){
  System.out.println(ans[j]);
  j++;
  }
 }
}
 
  