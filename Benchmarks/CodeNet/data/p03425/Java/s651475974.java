import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int march[] = new int[5];
        for (int i = 0; i < n; i++) {
            String str = sc.next();
            char ch = str.charAt(0);
            switch(ch) {
            case 'M' :
                march[0]++;
                break;
            case 'A' :
                march[1]++;
                break;
            case 'R' :
                march[2]++;
                break;
            case 'C' :
                march[3]++;
                break;
            case 'H' :
                march[4]++;
                break;
            }
        }
//        for (int i = 0; i < 5; i++) {
//            System.out.println(march[i]);
//        }

//        System.out.println("---------------------------------");

        long ans = 0;

        for (int i = 0; i <= 2; i++) {
            for (int j = i+1; j <=3 ; j++) {
                for (int k = j+1; k <=4 ; k++) {
                    ans += count(march[i], march[j], march[k]);
//                    System.out.println(i + "/"+ j + "/" + k + ":" + count(march[i], march[j], march[k]));
                }
            }
        }

        System.out.println(ans);
        sc.close();
    }

    static long count(long a, long b, long c) {
        return a * b * c;
    }

}
