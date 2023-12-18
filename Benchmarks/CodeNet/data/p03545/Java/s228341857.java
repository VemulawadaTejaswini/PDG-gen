import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        int A = Character.getNumericValue(a.charAt(0));
        int B = Character.getNumericValue(a.charAt(1));
        int C = Character.getNumericValue(a.charAt(2));
        int D = Character.getNumericValue(a.charAt(3));
        if(A + B + C + D == 7){
            System.out.printf("%d+%d+%d+%d=7", A, B, C, D);
        }
        else if(A + B + C - D == 7){
            System.out.printf("%d+%d+%d-%d=7", A, B, C, D);
        }
        else if(A + B - C + D == 7){
            System.out.printf("%d+%d-%d+%d=7", A, B, C, D);
        }
        else if(A - B + C + D == 7){
            System.out.printf("%d-%d+%d+%d=7", A, B, C, D);
        }
        else if(A + B - C - D == 7){
            System.out.printf("%d+%d-%d-%d=7", A, B, C, D);
        }
        else if(A - B + C - D == 7){
            System.out.printf("%d-%d+%d-%d=7", A, B, C, D);
        }
        else if(A - B - C + D == 7){
            System.out.printf("%d-%d-%d+%d=7", A, B, C, D);
        }
        else if(A - B - C - D == 7){
            System.out.printf("%d-%d-%d-%d=7", A, B, C, D);
        }
        else{
            return;
        }
    }
}