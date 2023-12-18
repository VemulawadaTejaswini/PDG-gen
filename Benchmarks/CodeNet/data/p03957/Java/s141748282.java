import java.util.Scanner;
class Main{
  public static void main(String[] args){
  Scanner inp=new Scanner(System.in);
  String a=inp.next();
  int b=0;
  while(a.charAt(b)!='C'&&b<a.length()-1){
    b++;
  }
  if(b!=a.length()-1){
    while(a.charAt(b)!='F'&&b<a.length()-1){
      b++;
    }
  }
  System.out.println(b);
  if(b>=a.length()-1){
    a="No";
  }else{
    a="Yes";
  }
 
  System.out.println(a);
  }
}