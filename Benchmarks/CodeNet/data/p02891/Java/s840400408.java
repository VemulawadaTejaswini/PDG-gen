public class Main{
  public static void main (String[] args) {
    String S = new java.util.Scanner(System.in).nextLine();
    String KString = new java.util.Scanner(System.in).nextLine();
    int K =  Integer.parseInt(KString);
    String X = "";
    for(int i = 0; i < K; i++){
      X += S;
    }
    char previous =' ';
    char now =' ';
    int A = 0;
    for(int i=0 ; i < X.length(); i++){
      previous = now;
      now = X.charAt(i);
      if(now == previous){
	A++;
	now = '1';
      }
    }
    System.out.println(A);
  }
}
