public class Main {
 public static void main(String...args) {
  final java.util.Scanner sc = new java.util.Scanner(System.in);
   final int num = sc.nextInt();
   String ans = "Christmas";
   for(int i=0;i<25-num;i++){
     ans+=" Eve";
   }
   System.out.println(ans);
 }
}