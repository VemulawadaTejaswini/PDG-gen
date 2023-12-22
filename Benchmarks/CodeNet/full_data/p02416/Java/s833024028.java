import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while(!input.equals("0")){
            int sum = 0;
            for(int i = 0; i < input.length(); i++){
                sum += input.charAt(i) - 48;
            }
            System.out.println(sum);
            input = sc.nextLine();
        }
    }
}

