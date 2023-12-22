import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        for(;;) {
            String s = scan.nextLine();
            if(s.equals("0")){
                break;
            }
            int sum=0;
            for (int i = 0; i < s.length(); i++) {

                char n = s.charAt(i);
                sum+=Character.getNumericValue(n);
            }
            System.out.println(sum);
        }
    }
}

