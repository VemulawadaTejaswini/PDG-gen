import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int K  = scanner.nextInt();
        int S  = scanner.nextInt();
        int Ans = 0;
        for (int X = 0;X <= K;X++){
             for (int Y = 0;Y <= K;Y++){
                  for (int Z = 0;Z <= K;Z++){
                      if (X+Y+Z==S){
                          Ans += 1;
                      }
                  }
             }
        }
        System.out.println(Ans);
    }
}