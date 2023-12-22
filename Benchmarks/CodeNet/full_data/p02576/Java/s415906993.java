import java.util.*;

public class Main{
        public static void main(String[] args){

                Scanner sc = new Scanner(System.in);
                String[] input = sc.nextLine().split(" ");
                sc.close();
        int N,X,T;
        N = Integer.parseInt(input[0]);
        X = Integer.parseInt(input[1]);
        T = Integer.parseInt(input[2]);

                int result= (N / X) * T ;
        if(N%X != 0){
            result += T;
        }
        System.out.println(result);
        }
}
