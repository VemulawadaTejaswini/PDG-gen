import java.util.Scanner;

class Main {
 public static void main(String[] args){
   //変数の初期化
   Scanner scanner = new Scanner(System.in);
   
   //入力
   System.out.print("input: ");
   int inputA = scanner.nextInt();
   int inputB = scanner.nextInt();
   int K = scanner.netInt();
   
   for(int i = 1; i <= K; i++) {
     if(inputA >= 1) {
       inputA--;
     } else if(inputA < 1 && inputB >= 1) {
       inputB--;
     } else {

     }
   }
   
   //出力
   System.out.println("output: " + inputA);
   System.out.println("output: " + inputB);
   
 }
}