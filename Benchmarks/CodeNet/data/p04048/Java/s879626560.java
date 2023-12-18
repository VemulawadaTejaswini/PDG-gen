import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long N,X,sum_length=0;
        N=sc.nextInt();
        X=sc.nextInt();
        if(X<=N/2) sum_length = 6*X;
        else sum_length = X+6*(N-X);
        System.out.println(sum_length);
    }
}