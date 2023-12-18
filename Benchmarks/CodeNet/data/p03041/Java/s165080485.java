import java.util.*;

public class Main {
    public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    String S = sc.next();
    char[]c = S.toCharArray();

    if(c[K-1]=='A'){
        c[K-1]='a';
    }else if(c[K-1]=='B'){
        c[K-1]='b';
    }else{
        c[K-1]='c';
    }
    System.out.println(String.valueOf(c));    
      }
}