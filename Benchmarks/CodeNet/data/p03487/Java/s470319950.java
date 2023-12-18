import java.util.Arrays;
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            int[] a= new int[N]; 
            
            for (int i=0; i<N; i++){
                a[i] = scanner.nextInt();
            }
            Arrays.sort(a);
            for(int i=0; i<N; i++){
                System.out.println(a[i]);
            }
            
            int t = a[0];
            int numt = 1;
            int nomitt = 0;
            int i = 1;
            while (i < N){
                if (t == a[i]){
                    numt++;
                }else{
                    if (numt < t){
                        nomitt += numt;
                    } else if (t < numt){
                        nomitt+= numt - t;
                    }
                    t = a[i];
                    numt = 1;
                }
                i++;
            }
            if (numt < t){
                nomitt += numt;
            } else if (t < numt){
                nomitt+= numt - t;
            }
            System.out.println(nomitt);
        };
}