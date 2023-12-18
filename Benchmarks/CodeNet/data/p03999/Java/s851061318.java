import java.util.Scanner;

public class Main {

    private static long totalSum = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String number = scan.next();
        helper(0,number,"");
        System.out.println(totalSum);
    }

    private static void helper(int index, String orig, String formatted){

        if(index == orig.length()){
            String[] numbers = formatted.split("\\+");
            long sum = 0;
            for(String num : numbers){
                sum += Long.parseLong(num);
            }
            totalSum += sum;
            return;
        }

        if(index < orig.length()-1)
           helper(index+1, orig, formatted + orig.charAt(index) + "+");
        helper(index+1, orig, formatted + orig.charAt(index));
    }
}