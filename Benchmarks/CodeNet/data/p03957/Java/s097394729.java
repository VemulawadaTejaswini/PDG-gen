import java.util.Scanner;
class Main{
  public static void main(String[] args){
  Scanner inp=new Scanner(System.in);
  String a=inp.next();
  int b=0;
  while(a.charAt(b)!='c'&&b>a.length()){
    b++;
  }
  if(b!=a.length()-1){
    while(a.charAt(b)!='f'&&b>a.length()){
      b++;
    }
  }
  if(b>=a.length()){
    a="No";
  }else{
    a="Yes";
  }
 
  System.out.println(a);
  }
}