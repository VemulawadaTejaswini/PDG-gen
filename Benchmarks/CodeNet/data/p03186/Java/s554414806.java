import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Taro taro = new Taro();
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt(); //解毒剤入りの美味しくないクッキー
        int B = scn.nextInt(); //解毒剤入りの美味しいクッキー
        int C = scn.nextInt(); //毒入りの美味しいクッキー   
        taro.get(A, B, C);   
        System.out.println(taro.sequence());
        scn.close();
    }

}

class Taro {
    boolean isPoison = false;
    int A = 0;
    int B = 0;
    int C = 0;
    int tasty_count = 0;

    void get(int a, int b, int c) {
        A = a;
        B = b;
        C = c;
    }

    void eat(String cookie_name) {
        if(cookie_name.equals("A")) {
            A--;
            isPoison = false;
        } else if(cookie_name.equals("B")) {
            B--;
            isPoison = false;
            tasty_count++;
        } else {
            C--;
            isPoison = true;
            tasty_count++;
        }
    }

    void choice() {
        if( C > 0 ) {
            if(!isPoison) {
                eat("C");
            } else {
                metaPoison();
            }
        } else {
            metaPoison();
        }
    }

    void metaPoison() {
        if (B > 0) {
            eat("B");
        } else if (A > 0) {
            eat("A");
        } else {
            System.out.println("解毒剤がありません．");
        }
    }

    int sequence() {
        while(A + B > 0) {
            choice();
        }
        if(A==0 && B==0 && C>0) tasty_count++;
        return tasty_count;
    }
}