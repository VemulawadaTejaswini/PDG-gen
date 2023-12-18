import java.util.Scanner;
import java.io.IOException;

class Main{
  public static void main(String... args)throws IOException{
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    int N = scan.nextInt();
    char[] ch = str.toCharArray();
    int i;
    for(i=0;i<str.length()-1;i++){
      int diff = 'z' - ch[i];
      if(ch[i] != 'a' && N > diff ) {
        ch[i] = 'a';
        N-=(diff+1);
      }
    }
    ch[i] += (N%26);
    if(ch[i] > 'z') ch[i] -=26;
    for(char a: ch) System.out.print(a);
    System.out.println();


  }
}
