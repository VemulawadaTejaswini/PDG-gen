import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        int N = 0;
        int[] a_i;
        int mas;
        mas = 0;
        Scanner scan = new Scanner(System.in);
        N = scan.nextInt();
         a_i = new int[N];
        for(int i = 0;i<N;i++){
            a_i[i] = scan.nextInt();
        }
        for(int i = 0;i<N;i++){
            if(i%2==1 && a_i[i] %2 == 1){
               mas++; 
            }
        }
        System.out.println(mas);
    }
}