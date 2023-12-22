import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tx = new Scanner(System.in);

        int a, b,c, cont = 0;

        a = tx.nextInt();
        int arre[] = new int[a];
        for (int i = 0; i < a; i++) {
            arre[i]=tx.nextInt();
        }
        b = tx.nextInt();
        for (int i = 0; i < b; i++) {
            c=tx.nextInt();
            for (int j = 0; j < a; j++) {
                if (c==arre[j]) {
                    cont++;
                    break;
                    
                }
            }
        }
        System.out.println(cont);

    }

}
