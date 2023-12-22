import java.util;
class Main{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
  String po=sc.next();
  String s=sc.next();
  boolean b=false;
  for(char c='a';c<='z';c++){
  if((po+c).equals(s)){
  b=true;
  }
  }
  System.out.println(b?"Yes":"No");
}
}