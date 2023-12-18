import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner input;
        int A,B,C,X;
        input = new Scanner(System.in);
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        X = input.nextInt();
        int ans = 0;
        for (int i = 0; i < A+1; i++){
          for (int j = 0; j < B+1; j++){
            for (int k = 0; k < C+1; k++){
              if (500*i + 100*j + 50*k == X){
                ans += 1;
              }
            }
          }
        }
        System.out.println(ans);
    }
}