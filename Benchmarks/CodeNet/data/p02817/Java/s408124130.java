import java.util.Scanner; 
public class main{
 public static void main(String args[])
 {
   Scanner sc = new Scanner(System.in);
   String S = sc.nextString();
   String T = sc.nextString();
   int sl = S.length();
   int tl = T.length();
   if(sl>tl){System.out.println(S+T);}
   else System.out.println(T+S);
 }
}