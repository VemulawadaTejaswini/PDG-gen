import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String ab = in.nextLine();
            String[] ls = ab.split(" ",0);
            int[] ls2 = new int[2];
            for (int i = 0 ; i < 2; i++) {
                ls2[i] = Integer.parseInt(ls[i]);
            }
            int c = ls2[0] + ls2[1];
            int ans = String.valueOf(c).length();
            System.out.println(ans);
        }
    }
}