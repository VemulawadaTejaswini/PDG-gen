import java.util.Scanner;

class Main{
    public static void main(String[] args){
 
        Scanner sc = new Scanner(System.in);
     
        int A = sc.nextInt(); 
        int B = sc.nextInt(); 
        int K = sc.nextInt();
     
        if(2 * K  <= B - A  ){
          for(int i = 0 ; i < K ; i ++ ){
            System.out.println(A + i);
          }
          for(int i = K - 1 ; i >= 0  ; i -- ){
            System.out.println(B - i);
          }
        } else {
          for(int i = 0 ; i < B - A + 1;i ++ ){
            System.out.println(A + i);
          }
        }
      }
}