import java.util.Scanner;

class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    int a;
    int b = 0;
    int c = 0;
    char[] d = S.toCharArray();
    for(a=0;a<N;a++){
      if(d[a] == 'W'){
        b++;
      }else{
        c++;
      }
    }

    if(b>=c){
      System.out.println(c);
    }else{
      System.out.println(b);
    }
  }
}
