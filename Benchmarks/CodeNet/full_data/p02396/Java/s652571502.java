import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    long count = 1;

        while(true){
            String x = sc.nextLine();
            if(x.equals("0")){
                break;
            }else{
                System.out.println("Case " + count + " " + x);
                System.out.println("\n");
                count++;
            }
        }
    }
}