//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int x,y;
//        int suma = 0,sumb = 0,kk;
//        while(n-- > 0) {
//            x = scanner.nextInt();
//            y = scanner.nextInt();
//            suma += x;
//            kk = dian(y);
//            if(kk == -1)
//            {
//                suma -= x;
//            } else {
//                sumb = sumb + x * kk;
//            }
//        }
//        double ans = sumb * 1.0 / suma;
//        if(ans >0)
//            System.out.printf("%.2f\n",ans);
//        else
//            System.out.println(-1);
//    }
//
//    public static int dian(int y) {
//        if(y>= 90 && y <= 100)
//            return 4;
//        else if(y>=80)
//            return 3;
//        else if(y>=70)
//            return 2;
//        else if(y>=60)
//            return 1;
//        else if(y>=0)
//            return 0;
//        else
//            return -1;
//    }
//}




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long k = scanner.nextLong();
        if(b-a+1 <= k) {
            for(long i = a;i <= b;i++) {
                System.out.println(i);
            }
        } else {
            long i,j;
            for(i = a;i < k+a;i++) {
                System.out.println(i);
            }
            for(j = b-k+1;j <b;j++) {
                if(j == i-1)
                    continue;
                System.out.println(j);
            }
            System.out.print(b);
        }
    }
}
