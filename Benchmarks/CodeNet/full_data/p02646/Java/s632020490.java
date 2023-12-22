import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
      	int V = sc.nextInt();
      	int B = sc.nextInt();
      	int W = sc.nextInt();
      	int T = sc.nextInt();
        long A1 = A;
      	long B1 = B;
      	int ans = 0;
      	for(int i = 0;i<T;i++){
          A1 = A1 + V;
          B1 = B1 + W;
          if(A1 == B1){ ans = 1; break;}
        }
        if(ans == 1){
          System.out.println("YES");
        } else {
          System.out.println("NO");
        }
        
    }
}