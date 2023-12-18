import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
      	int B = sc.nextInt();
      	int C = sc.nextInt();
      	int K = sc.nextInt();
      	int ans = 0;
      	int i = 0;
        while(i<K){
          for(int j=0;j<A && i<K;j++){
            ans = ans + 1;
            i++;
          }
          for(int j=0;j<B && i<K;j++){
            ans = ans;
            i++;
          }
          for(int j=0;j<C && i<K;j++){
            ans = ans -1;
            i++;
          }
        }
      	System.out.println(ans);
    }
}