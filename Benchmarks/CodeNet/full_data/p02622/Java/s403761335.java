import java.util.Scanner;
class Main{
    public static void main(String []args){
    Scanner input=new Scanner(System.in);
      String S=input.next();
      String T=input.next();
      int result=0;
      for(int i=0;i<S.length();i++){
      if(S.charAt(i)!=T.charAt(i)){
      ++result;}
      }System.out.println(result);
    }
}