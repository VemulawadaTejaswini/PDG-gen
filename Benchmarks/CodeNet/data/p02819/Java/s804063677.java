import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();

       
        loop : for (int i=0; i<X; i++){
            X = X+i;
            for(int k=2; k<X;k++){
                if(X%k==0){
                    break;
                }
                if(k == X-1){
                    System.out.println(X);
                    break loop;
                }
            }
        }
    }


}
