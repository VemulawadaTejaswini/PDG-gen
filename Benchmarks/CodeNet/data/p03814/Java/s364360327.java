import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str =  scanner.next();
        int lea = 0;
        int lez = 0;
        int diff = 0;

        for(int i = 0; i < str.length(); i ++){
            char str2 = str.charAt(i);

            if(str2 == 'A') {
                lea = i;
            } else if(str2 == 'Z'){
                lez = i;
            }
        }
        diff = lez - lea + 1;
        System.out.println(diff);
    }
}
