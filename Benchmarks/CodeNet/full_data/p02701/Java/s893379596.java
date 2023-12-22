import java.util.*;

public class Main {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        int N = 0;
        int unique = 0;
        N = sc.nextInt();
        String[] ar = new String[N];
        for(int i=0;i<N;i++){ 
            ar[i] = sc.next();
            int EndCount = 0;
            for (int j=0; j<i; j++) {
                if (ar[i].equals(ar[j]) ) {
                    EndCount = 1;
                    break;
                }
            }
            if(EndCount==0){
                   unique++;
            }
        }
    
        System.out.println(unique);
    }
}