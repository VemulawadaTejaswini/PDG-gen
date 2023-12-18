    import java.util.Scanner;
     
    public class Main{
     
    static int ruijo(int n, int r){
      if(r == 0) return 1;
      else return n*ruijo(n,r-1);
    }
     
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), K = sc.nextInt();
        System.out.println(K*ruijo(N-1,K-1));
      }
    }