import java.util.Scanner;
class Main{
 public static void main(String[] args){
  Scanner sc = new Scanner(System.in);
   int N = Integer.parseInt(sc.next());
   int A = Integer.parseInt(sc.next());
   int B = Integer.parseInt(sc.next());
   int na = N*A;
  if(na > B){
    System.out.println(B);
  }else{
    System.out.println(na);
  }
   sc.close();
 }
}