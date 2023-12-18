import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int answer = 753;

        for (int i = 0; i <= s.length() - 3; i++){
            int number = Integer.parseInt(s.substring(i, i + 3));

            int sabun = Math.abs(number - 753);

            if(sabun - answer < 0){
                answer = sabun;
            }
        }

        System.out.println(answer);


    }

}
