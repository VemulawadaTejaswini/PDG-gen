import java.util.Scanner;

/**
 * Created by wild on 2016/07/23.
 */
public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int[] iroha = new int[3];
        for (int  i= 0; i< iroha.length; i++){
            iroha[i] = scan.nextInt();
        }

        int count = 0;
        for (int tmp: iroha){
            switch (tmp){
                case 5:
                    break;
                case 7:
                    break;
                default:
                    count++;
                    break;
            }
        }
        if (count == 0){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}