import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int s=sc.next().charAt(0);
    System.out.println(s=='A'?'T':s=='T'?'A':s=='G'?'C':'G');
  }
}
