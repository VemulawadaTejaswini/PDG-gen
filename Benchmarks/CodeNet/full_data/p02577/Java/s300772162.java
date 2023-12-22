import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String N = sc.next();
        System.out.println(new Solver().solve(N));
    }
}

class Solver {
    public String solve(String N){
        long number = 0;
        for(char c: N.toCharArray()){
            number += Character.getNumericValue(c);
        }

        return number % 9 == 0 ? "Yes" : "No";
    }
}
