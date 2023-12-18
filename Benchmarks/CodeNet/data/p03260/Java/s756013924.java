import java.util*;
class Main{
 public static void main(String args[]){
 Scanner sc = new Scanner();
 int a=0,b=0;
 a=sc.nextInt();
 b=sc.nextInt();
 if(a%2==0){
      System.out.println("No");
      return 0;
  }
 else if(b%2==0){
     System.out.println("No");
     return 0;
 }
 else System.out.println("Yes");
 }
}