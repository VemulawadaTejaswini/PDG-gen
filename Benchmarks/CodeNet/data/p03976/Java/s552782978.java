import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int max = n/k;
//        System.out.println("Max="+max);
        String pi[]= new String[n];
        String tmp;
        for (int i=0; i<n; i++) {
            pi[i] = sc.next();
        }
        for (int i=1; i<n; i++) {            
            for (int j=0; j<n-i; j++) {
                if (pi[j].compareToIgnoreCase(pi[j+1]) > 0) {
                    tmp = pi[j]; pi[j] = pi[j+1]; pi[j+1] = tmp;
                }
            }
        }
        int count = 1;
        int usable = n;
        for (int i=1; i<n; i++) {
            if (pi[i-1].charAt(0)==pi[i].charAt(0)) {
                count++;
            } else {
                count = 1;
            }
            if (count > max) {
                usable--;
            } 
        }
//                System.out.println(usable);
        int ans = (int) usable/k;
        System.out.println(ans);
    }
}