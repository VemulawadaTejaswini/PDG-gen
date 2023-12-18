import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	    Result result = execute(sc.nextLine());
        System.out.println(result);
    }

    public static Result execute(String s){
        if(s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5)){
            return Result.Yes;
        }
        return Result.No;
    }

    public static enum Result{
        Yes,
        No;
    }
}
