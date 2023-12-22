import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String keyword = sc.next();
        String word;
        int count = 0;

        while(!((word = sc.next()).equals("END_OF_TEXT"))){
            if(word.equals(keyword)){
                count++;
            }
        }

        System.out.println(count);
    }
}

