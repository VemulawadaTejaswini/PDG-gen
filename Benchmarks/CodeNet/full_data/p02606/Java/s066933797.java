import java.util.*;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);
        int L = scan.nextInt();
        int R = scan.nextInt();
        int d = scan.nextInt();
        int ans = 0;
        for(int i=L;i<=R;i++){
            if(i%d==0) ans++;
        }
        System.out.println(ans);
        }
    }
