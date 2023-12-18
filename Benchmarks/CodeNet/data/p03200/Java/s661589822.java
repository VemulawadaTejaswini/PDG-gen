import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int count = 0;
        int total = 0;

        for (int index = S.length(); index > 0; index-- ){
            if (S.charAt(index-1) == 'B'){
                total += count;
            }else{
                count++;
            }
        }
        System.out.println(total);
    }
}