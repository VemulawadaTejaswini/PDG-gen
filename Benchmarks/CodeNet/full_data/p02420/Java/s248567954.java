import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true) {
            String Cards = sc.next();
            int i, j;
            int l = Cards.length();
            char w[] = new char[l];
            char R[] = new char[l];
            for (i = 0; i < l; i++) {
                w[i] = Cards.charAt(i);
            }
            if(w[0] == '-') break;
            int m = sc.nextInt();
            for (i = 0; i < m; i++) {
                int h = sc.nextInt();
                for (j = 0; j < l; j++) {
                    if (j < h) {
                        R[j] = w[j];
                    } else {
                        w[j - h] = w[j];
                    }
                }
                for (j = 0; j < h; j++) {
                    w[l - h + j] = R[j];
                }
            }
            for (i = 0; i < l; i++) {
                System.out.printf("%c", w[i]);
            }
            System.out.printf("\n");
        }
    }
}

