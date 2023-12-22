
import java.util.Scanner;
 
class Main {
    public static void main(String[] a){
        Scanner scan = new Scanner(System.in);
        int time = scan.nextInt();
        for(int i = 0;i <= time;i++){
            String input = scan.nextLine().replaceAll("Hoshino","Hoshina");
            System.out.println(input);
        }
    }
}