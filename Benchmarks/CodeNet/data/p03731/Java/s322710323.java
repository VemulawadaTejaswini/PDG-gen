    import java.util.Scanner;
     
    public class Main{
      static int n,T,sum,x;
      static int[] tn;
     
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
     
        n = sc.nextInt();
        T = sc.nextInt();
        tn = new int[200000];
        for(int i = 0; i < n; i++){
          tn[i] = sc.nextInt();
        }
     
        for(int i = 0; i < n; i++){
          x = tn[i+1]-tn[i];
          if(x < T && i != n-1){
            sum += x;
          }
          else{
            sum += T;
          }
        }
     
        System.out.println(sum);
      }
    }