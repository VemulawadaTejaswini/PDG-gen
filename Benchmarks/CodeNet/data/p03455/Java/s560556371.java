public class Main {
 public static void main(String args []) {
   int a = 3;
   int b = 4; 
   
   this.judge(a,b);
   
 }
 public void judge (int a ,int b){
  // 奇数偶数判定
  if (a * b % 2 == 0 ) {
    System.out.println("Even");
  } else {
    System.out.println("Odd");
  }
 }  
}
