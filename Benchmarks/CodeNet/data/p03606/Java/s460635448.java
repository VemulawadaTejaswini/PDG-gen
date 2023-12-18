import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        
        int res=0;
        for(int i=0;i<n;i++) {
            int l=sc.nextInt();
            int r=sc.nextInt();
            res += r-l + 1;
        }
        System.out.println(res);
    }
}