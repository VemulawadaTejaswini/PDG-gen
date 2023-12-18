import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int N = sc.nextInt();
        String S = sc.next();
        int ans = 0;
        for(int i = 0; i < N-2; i++){
          for(int j = i+1; j < N-1; j++){
            for(int k = j+1; k < N; k++){
              char a = S.charAt(i);
              char b = S.charAt(j);
              char c = S.charAt(k);
              if(a != b && b != c && a != c && j-i != k-j){
                ans+=1;
              }
            }
          }
        }
        System.out.println(ans);
      }
}