import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A[] = new int[n];
        for(int i = 0; i < n; i++){
          A[i] = sc.nextInt();
        }
        for(int x = 0; x < n; x++){
          if(x == n-1){
            System.out.println(A[x]);
          }else{
            System.out.print(A[x]);
            System.out.print(" ");
          }
        }
        for(int i = 1; i < n; i++){
          int v =A[i];
          int j = i -1;
          while(j>=0 && A[j]>v){
            A[j+1] = A[j];
            j = j-1;
            A[j+1] = v;
          }
          for(int x = 0; x < n; x++){
            if(x == n-1){
              System.out.println(A[x]);
            }else{
              System.out.print(A[x]);
              System.out.print(" ");
            }
          }
        }
      }
    }
