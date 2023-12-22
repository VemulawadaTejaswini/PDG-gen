import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String cards = scn.next();

        while(!cards.equals("-")){
            int m = scn.nextInt();
            for(int i=0;i<m;i++){
                int h = scn.nextInt();
                String top = cards.substring(0,h);
                String bottom = cards.substring(h,cards.length());
                cards = bottom + top;
            }
            System.out.println(cards);
            cards = scn.next();
        }



    }

}
