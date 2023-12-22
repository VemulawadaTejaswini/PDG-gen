import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            int answer=0;
            String input_number = sc.nextLine();
            if(input_number.equals("0"))break;
            for(int i=0;i<input_number.length();i++){
                answer += input_number.charAt(i) - '0';
            }
            System.out.println(answer);

        }
    }
}
