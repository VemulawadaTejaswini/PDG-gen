import java.util.Scanner;

public class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  String op=sc.next();

  int b=sc.nextInt();
  
  int i=0,j=0;
  int[] ans=new int[10000];

  while(!(op.equals("?"))){
  if(op.equals("+")) {
  ans[i]=a+b;
  }else if(op.equals("-")){
  ans[i]=a-b;
  }else if(op.equals("*")){
  ans[i]=a*b;
  }else{
  ans[i]=a/b;
  }
  i++;
  }

  while(j<i){
  System.out.println(ans[j]);
  j++;
  }
 }
}
 
  