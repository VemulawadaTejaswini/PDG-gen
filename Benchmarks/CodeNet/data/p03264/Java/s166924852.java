import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc =new Scanner(System.in);

        int K = sc.nextInt();
        int N =0;
          for (int i =0; i<K; i++){
            for (int j=0; j<K; j++){
              if ((i % 2 ==0 && j % 2 !=0)  || (j % 2 == 0 && i % 2 != 0)){
                N += 1;
              }
            }
          }
            System.out.println(N / 2);

    }
}
