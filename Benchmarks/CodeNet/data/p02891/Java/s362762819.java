import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String str=in.next();
    String s=str+str.substring(0,1);
    int k=in.nextInt();
    int len=s.length()-1;
    long res=0;
    while(len>0){
      if(s.charAt(len)==s.charAt(len-1)){
        res++;
        len--;
      }
      len--;
    }
        System.out.println(res*k);
          
  }
}
