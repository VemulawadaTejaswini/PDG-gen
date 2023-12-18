import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
    // S,T,A,Bを入力
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    String T = scan.next();
    String As = scan.next();
    String Bs = scan.next();
    String U = scan.next();
 
    // A,Bを数値に変換
	int A = Integer.parseInt(As);
	int B = Integer.parseInt(Bs);

     if(U.equals(S)) System.out.println(A-1);
     if(U.equals(T)) System.out.println(B-1);
          
     scan.close();
    }
}