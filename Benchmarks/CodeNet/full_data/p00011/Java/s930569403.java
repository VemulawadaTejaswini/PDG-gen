
import java.util.Scanner;

public class Main {
    public static void main(Sring[] args){}
    try(Scanner sc = new Scanner ( System.in)){
        int w =sc.nextInt();
        int n =sc.nextInt();
        int[] values = new int[w];
        for(int i = 0; i < values.length; i++){
            values[i] = i + 1 ;
        }
        for( int i=0 ; i<n ;i++){
            String str = sc.next();
            String[] ab = str.split(",");
            int a = Integar.parseInt(ab[0])-1;
            int b = Integar.parseInt(ab[1])-1;
            int tmp;
            tmp=values[a];
            values[a]=values[b];
            values[b]=tmp;
        }

        for( int i=0 ; i<values.length ;i++) {
            System.out.println(values[i]);
        }
    }
}

