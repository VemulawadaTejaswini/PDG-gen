import java.util.Scanner;

public class Main{
    public static void main(String[]argc){
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int count=0;
        while(true){
            String text = sc.next();
            if(text.equals("END_OF_TEXT")){
                break;
            }else if(text.equalsIgnoreCase(word)){
                count++;
            }
        }
        System.out.println(count);
    }
}

