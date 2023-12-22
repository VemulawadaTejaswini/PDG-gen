import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner s = new Scanner(System.in);

        while(true){
            int n =  s.nextInt();

            if(n == 0) break;

            int a = 0;
            int b = 0;

            for(int i = 0; i < n; i++){
                int cardA = s.nextInt();
                int cardB = s.nextInt();

                if (cardA > cardB){
                    a += cardA + cardB;
                } else if(cardB > cardA) {
                    b += cardA + cardB;
                } else {
                    a += cardA;
                    b += cardB;
                }
            }

            System.out.println( a + " " + b);
        }

    }

}