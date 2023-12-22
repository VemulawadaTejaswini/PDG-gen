import java.util.Scanner;

public class SimpleC{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int a=sc.nextInt();
  String op=sc.nextString();
  if(!(op.equals"+")&&!(op.equals"-")&&!(op.equals"*")&&!(op.equals"/")){
  op="?";
  int ans;
  int b=sc.nextInt();
  if(!(op.equals"?")){
  if(op.equals"+") ans=a+b;
  else if(op.equals"-") ans=a-b;
  else if(op.equals"*") ans=a*b;
  else ans=a/b;
  System.out.println(ans);
  }else{
   
   }
  }
 }
}
 
  