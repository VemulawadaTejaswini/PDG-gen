import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();

        int answer = 0;
        for (int sen = 0; sen < 10; sen++){
            for (int hyaku = 0; hyaku < 10; hyaku++){
                for (int zyuu = 0; zyuu < 10; zyuu++){
                    for (int ichi = 0; ichi < 10; ichi++){
                        if (keta(sen, hyaku, zyuu, ichi) >= a &&
                                keta(sen, hyaku, zyuu, ichi) <= b &&
                                sum(sen, hyaku, zyuu, ichi) <= n
                                ){
                            answer+= sum(sen, hyaku, zyuu, ichi);
                        }
                    }
                }
            }
        }

        System.out.println(answer);
    }

    public static int sum(int a, int b, int c, int d){
        return a * 1000 + b * 100 + c * 10 + d;
    }

    public static int keta(int a, int b, int c, int d){
        return a + b + c + d;
    }

}
