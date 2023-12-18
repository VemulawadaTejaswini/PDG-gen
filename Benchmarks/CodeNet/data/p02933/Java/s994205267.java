import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String s = sc.nextLine();
        System.out.print(maxAnswer(a, s));
    }

    private static String maxAnswer(Integer a, String s){
        if (a >= 3200){
            return s;
        }else{
            return "red";
        }
    }
}
