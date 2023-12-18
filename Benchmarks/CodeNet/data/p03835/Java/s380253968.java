import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int K  = scanner.nextInt();
        int S  = scanner.nextInt();
        int Ans = 0;
        for (int X = 0;X <= K;X++){
             if(X > S){
                 break;
             }
             for (int Y = 0;Y <= K;Y++){
                  if(X+Y > S){
                      break;
                  }
                  for (int Z = 0;Z <= K;Z++){
                      if (X+Y+Z==S){
                          Ans += 1;
                          break;
                      }
                  } 
             }
        }
        System.out.println(Ans);
    }
}
