import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int[] a = new int[n];
                for(int i = 0 ; i < n ; i++){
                        a[i] = sc.nextInt();
                }
                sc.close();
                Arrays.sort(a);
                int yono = 0;
                for(int i = a[1] ; i > 0 && yono == 0 ; i--){
                        int che = 0;
                        for(int j = 0 ; j < n && che != 2 ; j++){
                                if(a[j] % i != 0) che++;
                        }
                        if(che != 2) yono = i;
                }
                System.out.println(yono);
        }
}