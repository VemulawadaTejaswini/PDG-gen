import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = s.length();
        
        boolean isStrong = true;
        
        for(int i=0; i<n; i++) {
            if(s.charAt(i) != s.charAt(n-i-1)) {
                isStrong = false;
                break;
            }
        }
        
        int n2 = (n-1)/2;
        for(int i=0; i<n2; i++) {
            if(s.charAt(i) != s.charAt(n2-i-1)) {
                isStrong = false;
                break;
            }
        }
        
        int n3 = (n+3)/2;
        for(int i=n3-1; i<n; i++) {
            if(s.charAt(i) != s.charAt(n-i+n3-1-1)) {
                isStrong = false;
                break;
            }
        }
        
        System.out.println(isStrong?"Yes":"No");
    }
}
