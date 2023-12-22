import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long sosuu = 1000000007;
        
        String line = sc.nextLine();
        int ma=line.indexOf(" ");
        int m=Integer.parseInt(line.substring(0, ma));
        int n=Integer.parseInt(line.substring(ma+1));
        
        long ms=m%sosuu;
        for(int i=1;i<n;i++){
        	ms=(ms%sosuu)*m;
        }
        
        System.out.println(ms%sosuu);
    }
}