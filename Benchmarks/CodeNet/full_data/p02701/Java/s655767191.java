import java.util.*;
public class Main {
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                String[] a = new String[n];
                for(int i = 0 ; i < n ; i++){
                        a[i] = sc.next();
                }
                sc.close();
                Arrays.sort(a);
                int yono = 1;
                for(int i = 1 ; i < n ; i++){
                        if(!a[i - 1].equals(a[i])) yono++;
                }
                System.out.println(yono);
        }
}