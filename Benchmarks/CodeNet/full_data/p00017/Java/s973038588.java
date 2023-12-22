import java.util.Scanner;
import java.util.Vector;

class Main{
  public static void main(String[] av){
    Scanner sc = new Scanner(System.in);

    while(sc.hasNextLine()){
      StringBuffer line =  new StringBuffer(sc.nextLine());
      String[] words = line.toString().split(" ");
      int[] cntch1 = new int[256];
      int[] cntch2 = new int[256];
      for ( String word : words ){
        if ( word.length() == 3 || word.length() == 4 ){
          char c1 = word.charAt( 0 );
          char c2 = word.charAt( 1 );
          if ( 'a' <= c1 && c1 <= 'z' ){
            cntch1[(int)c1]++;
          }
          if ( 'a' <= c2 && c2 <= 'z' ){
            cntch2[(int)c2]++;
          }
        }
      }
      int max1 = 'a';
      for ( int i = 'a'; i <= 'z'; i++){
        if ( cntch1[max1] < cntch1[i] ){
          max1 = i;
        }
      }
      int max2 = 'a';
      for ( int i = 'a'; i <= 'z'; i++){
        if ( cntch2[max2] < cntch2[i] ){
          max2 = i;
        }
      }
      int dif = 't' - max1;
      for ( int i = 0; i < line.length(); ++i){
        char c = line.charAt(i);
        if ( 'a' <= c && c <= 'z' ){
          c += dif;
          if ( 'z' < c ){
           c += ('a'-'z'-1); 
          }
          if ( c < 'a' ){
            c += ('z'-'a'+1);
          }
        }
        line.setCharAt(i,c );
      }
      System.out.println( line );
    }
  }
}