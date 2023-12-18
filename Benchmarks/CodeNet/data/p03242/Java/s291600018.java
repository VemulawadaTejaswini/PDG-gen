import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    String n=new Scanner(System.in).next();
    char[] c=n.toCharArray();
    for(int i=0;i<3;i++){
      switch(c[i]){
        case '1':
          c[i]='9';
          break;
        case '9':
          c[i]='1';
          break;
      }
    }
    System.out.println(String.valueOf(c));
  }
}