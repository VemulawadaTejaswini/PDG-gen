import java.util.*;

public class Main {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        String userInput = sc.nextLine();

        String[] splitedUserInput = userInput.split("");
        String resultCd;
        for(int i = 0; i < splitedUserInput.length - 1; i++){
            if(splitedUserInput[i].equals(splitedUserInput[i+1])){
                resultCd = "Bad";
            }
        }
        resultCd = "Good";

        System.out.println(resultCd);
    }
}