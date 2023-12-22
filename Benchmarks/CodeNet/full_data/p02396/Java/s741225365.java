
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int array[] = new int[10000];
        int i;
        for (i = 0; i < 10000; i++) {
            array [i] = scan.nextInt();
            if(array[i] == 0){
                break;
            }
        }
        for (int j = 0; j < i; j++) {
            System.out.println("Case "+j+": "+array[j]);
        }
    }

}

