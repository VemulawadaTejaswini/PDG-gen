import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j, h, w;
        while(true) {
            int testdai2;
            int ansh = 999, answ = 999;
            int ansmenseki = 9999999;
            h=sc.nextInt();
            w=sc.nextInt();

            if(h == 0 && w == 0)break;

            int dia1 = (h * h) + (w * w);



            for( i = 1; i < 150; i++) {
                for( j=i+1 ; j < 150; j++) {
                    testdai2 = (i * i)+(j * j);

                    if(dia1 <= testdai2) {
                        if(dia1 == testdai2 && h >= i)continue;
                        if(testdai2 < ansmenseki) {
                        ansh = i;
                        answ = j;
                        ansmenseki = testdai2;
                        }
                    }
                }
            }
            System.out.println(ansh + " " + answ);
        }
        sc.close();
    }
}
