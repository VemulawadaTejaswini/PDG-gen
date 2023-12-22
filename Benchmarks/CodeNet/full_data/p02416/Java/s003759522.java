import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        long sum;
        String input;
        while (true){
            sum = 0;
            input = scanner.nextLine();

            if(input.equals("0")){
                break;
            }

            String[] mash = input.split("");

            for(String txt : mash){
                sum += Integer.parseInt(txt);
            }
            System.out.println(sum);
        }
        scanner.close();
    }
}

