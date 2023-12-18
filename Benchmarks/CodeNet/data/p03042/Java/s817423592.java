import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        int first = Integer.parseInt(s.substring(0,2));
        int second = Integer.parseInt(s.substring(2,4));

        if ((first > 12 && second > 12) || (first == 0 && second > 12)
                || (first > 12 && second == 0) || (first == 0 && second == 0)) {
            System.out.println("NA");
        }else if(first <= 12 && (second > 12 || second == 0)){
            System.out.println("MMYY");
        }else if((first > 12 || first == 0) && second <= 12) {
            System.out.println("YYMM");
        }else if(first <= 12 && second <= 12){
            System.out.println("AMBIGUOUS");
        }

        sc.close();
    }
}
