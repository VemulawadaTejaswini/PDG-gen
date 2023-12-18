import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int S =sc.nextInt();
    String s =Integer.toString(S);
    String t[] =s.split("",0);
    for(int i=1;i<4;i++){
      if(t[i]==t[i-1]){System.out.println("Bad");System.exit(0);}}
    System.out.println("Good");
  }
}