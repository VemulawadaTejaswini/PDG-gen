import java.util.Scanner;

public class test {
    public static void main(String[] args){
        int score = 0;
        Scanner scanner = new Scanner(System.in);

        String first_line = scanner.nextLine();
        for(int i = 0; i <=3; i++){
            char input = first_line.charAt(i);
            if(input=='+'){
                score++;
            }else{
                score--;
            }
        }
        scanner.close();

        System.out.println(score);
    }

}
