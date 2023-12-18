
import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] p = new int[n];
        for(int i = 0; i < n; i++){
            p[i] = stdIn.nextInt();
        }
        int count = 0;
        int[] c = p.clone();
        Arrays.sort(c);
        for(int i = 0; i < n; i++){
            if(p[i] != c[i]){
                count++;
                if(count > 2){
                    System.out.println("No");
                    return;
                } 
            }
        }
        System.out.println("Yes");
    }
}