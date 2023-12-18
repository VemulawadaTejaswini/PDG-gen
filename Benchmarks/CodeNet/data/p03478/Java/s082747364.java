import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum = 0;
        for(int i=1;i<=n;i++) {
            int t1= i%10;
            int t2= i/10;
            int t=t1 + t2;
            if(a<= t && t <= b) {
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}