import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    long A = sc.nextLong();
    long B =sc.nextLong();
    long C =sc.nextLong();
    long D =sc.nextLong();
    long E =(A-1)/C;long F =B/C;
    long G =(A-1)/D;long H =B/D;
    long I =C*D;
    long s =C%D;
    while(s!=0){
      s=C%D;
      C=D;
      D=s;}
    long J =I/C;
    long K =(A-1)/J;long L =B/J;
    long ans =B-A+1-F+E+G-H+L-K;
    System.out.println(ans);
  }
}