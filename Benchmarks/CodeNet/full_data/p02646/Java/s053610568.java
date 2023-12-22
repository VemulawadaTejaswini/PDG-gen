import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
      	long V = sc.nextLong();
      	long B = sc.nextLong();
      	long W = sc.nextLong();
      	long T = sc.nextLong();
        long A1 = A;
      	long B1 = B;
      	int ans = 0;
      	if(A < B) {
      	for(long i = 0;i<T;i++){
          A1 = A1 + V;
          B1 = B1 + W;
          if(A1 == B1){ ans = 1; break;}
        }
        } else if (A > B) {
        for(long i = 0;i<T;i++){
          A1 = A1 - V;
          B1 = B1 - W;
          if(A1 == B1){ ans = 1; break;}
        }
        } else {
          ans = 1;
        }
          
        if(ans == 1){
          System.out.println("YES");
        } else {
          System.out.println("NO");
        }
        
    }
}