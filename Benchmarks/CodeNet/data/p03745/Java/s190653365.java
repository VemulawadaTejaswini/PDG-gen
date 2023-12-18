import java.util.Scanner;

/**
 * Created by rere on 15/04/17.
 */
public class Main {

    public static void main (String args[]){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int tab[] = new int[n];

        for (int i = 0; i < n; i++){
            tab[i] = scan.nextInt();
        }

        int array = 1;

        if (n == 1) {
            System.out.println("1");
        }
        else{
            boolean dir = true;
            if (tab[0] > tab[1]){
                dir = false;
            }

            for (int i = 0; i + 1 < n; i++){
                if (dir && tab[i] > tab[i+1]){
                    dir = false;
                    array++;
                }
                else if (!dir && tab[i] < tab[i+1]){
                    dir = true;
                    array++;
                }
            }
        }

        System.out.println(array);
    }

}
