import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String word = scan.next().toLowerCase();
        int sum = 0;
        String end = "END_OF_TEXT";

        //endが入力されたらbreak
        while (true) {

            String sentence = scan.next();

            if(sentence.equals(end)){

                System.out.println(sum);
                break;

            }else if(sentence.toLowerCase().equals(word)){

                sum++;

            }
        }
    }
}
