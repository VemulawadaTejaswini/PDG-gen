import java.util.Scanner;

class GoodInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int i = in.nextInt(), pocitadlo = 0;
        String answer = "No";

        String s = Integer.toString(i);

        for(int x = 0; x < s.length(); x++){
            char c = s.charAt(x);

            for(int y = 0; y < s.length(); y++)
                if(s.charAt(y) == c) pocitadlo++;

            if(pocitadlo >= 3){
                answer = "Yes";
                break;
            }
            else pocitadlo = 0;
        }

        System.out.println(answer);
    }
}