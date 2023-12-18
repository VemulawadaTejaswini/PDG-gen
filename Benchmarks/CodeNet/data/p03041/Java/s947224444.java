import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    final int N=sc.nextInt();
    final int K=sc.nextInt();
    final String S=sc.next();
    char[] s=S.toCharArray();
    switch(s[K-1]){
      case 'A':
        s[K-1]='a';
        break;
      case 'B':
        s[K-1]='b';
        break;
      case 'C':
        s[K-1]='c';
        break;
    }
    System.out.println(String.valueOf(s));
  }
}