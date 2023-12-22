import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int[] count = new int[26];
        char[] alpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        StringBuilder input = new StringBuilder();

        while(scanner.hasNextLine()){
            String x = scanner.nextLine();
            if(x.length() == 0){
                break;
            }
            input.append(x);
        }



        char[] text = input.toString().toLowerCase().toCharArray();

        for(char txt : text){
            for(int i = 0; i < alpha.length; i++){
                if(txt == alpha[i]){
                    count[i]++;
                }
            }
        }

        for(int i = 0; i < alpha.length; i++){
            System.out.println(alpha[i] + " : " + count[i]);
        }

        scanner.close();
    }
}

