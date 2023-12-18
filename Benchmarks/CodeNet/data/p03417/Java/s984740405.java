import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        if(N==1 && M==1){
            System.out.println(1);
        }
        else if((N==1 && M!=1) || (N!=1 && M==1)){
            System.out.println(N * M - 2);
        }
        else{
            System.out.println(N * M - 2 * N - 2 * (M - 2));
        }
    }
}