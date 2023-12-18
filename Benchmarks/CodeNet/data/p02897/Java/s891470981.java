  1 import java.util.Scanner;//入力を取得する(Scanner)
  2 
  3 class Main {
  4         public static void main(String arts[]) {
  5                        int N;
  6                        Scanner sc = new Scanner(System.in);
  7                        N = sc.nextInt();
  8 
  9                        int target;
 10                        target = (N+1) / 2;// kiriage
 11                        double n = N;
 12 
 13                        System.out.println(target / n );
 14                        return; 
 15                }
 16     }
