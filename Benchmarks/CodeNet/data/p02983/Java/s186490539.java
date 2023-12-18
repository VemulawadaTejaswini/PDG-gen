import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int L = Integer.parseInt(sc.next());
        int R = Integer.parseInt(sc.next());

        sc.close();
        
        //R-Lが2019"以上"の場合は2019の倍数が含まれる
        if (R - L >= 2019) {

            System.out.println(0);
            System.exit(0);
        }

        long mod2019;
        //は2019で割ったあまりだから最大でも2018
        long min = 2018;

        for (long i = L; i < R; i++) {

            for (long j = i+1; j <= R; j++) {

                mod2019 = (i*j)%2019;

                if (min > mod2019) {

                    min = mod2019;
                }
                
                //2019は素数だから以下の記述は無意味、バグの発生原因になる
//                if (min == 0) {
//
//                    break;
//                }
            }

//            if (min == 0) {
//
//                break;
//            }
        }

        System.out.println(min);
    }

}