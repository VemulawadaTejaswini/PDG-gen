import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        int count = 0;
        while(true){
            String text = sc.nextLine();
            if(text.equals("END_OF_TEXT")){
                break;
            }
            String[] t = text.split(" ");
            for(String t_word:t){
                if(t_word.equalsIgnoreCase(word)){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}