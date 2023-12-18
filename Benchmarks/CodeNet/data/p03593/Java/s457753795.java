import java.util.Scanner;

class Main {
    void solve() {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt(), w= in.nextInt(); in.nextLine();
        int[] c = new int[26];
        for(int i = 0; i < h; i++) {
            String s = in.nextLine();
            for(char ch : s.toCharArray()) {
                c[ch - 'a']++;
            }
        }
        int four = 0, tow = 0, one = 0;
        for(int i: c) {
            four += i / 4;
            i = i % 4;
            tow += i / 2;
            one += i % 2;
        }
        //System.out.println("f: " + four + " tow: " + tow + " one: " + one);
        int a = h / 2 * w / 2;
        if(four >= a || h == 1 || w == 1) {
            if(h != 1 && w != 1) tow += (four - a) * 2;
            if(h%2 == 1 && w %2 == 1) {
                int b = h/2 + w/2;
                if(b == tow) {
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            }else if(h%2 == 1) {
                if(tow == w/2) {
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            }else if(w%2 == 1) {
                if(tow == h/2) {
                    System.out.println("Yes");
                }else {
                    System.out.println("No");
                }
            }else {
                System.out.println("Yes");
            }
        }else {
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        new Main().solve();
    }
}
