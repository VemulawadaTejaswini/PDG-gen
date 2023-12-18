import java.util.Scanner;
import java.io.IOException;

class Main{
  public static void main(String... args)throws IOException{
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    int N = scan.nextInt();
    char[] ch = str.toCharArray();
    int i;
    for(i=0;i<str.length();i++){
      int diff = 'z' - ch[i];
      if(N > diff) {
        ch[i]-=(ch[i]-'a');
        N-=(diff+1);
      }
    }
    ch[i-1]+= (N%26);
    for(char a: ch)
    System.out.print(a);
    System.out.println();


  }
}
