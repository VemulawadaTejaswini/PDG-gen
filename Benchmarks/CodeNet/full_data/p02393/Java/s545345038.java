import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int x = a.nextInt();
        int y = a.nextInt();
        int z = a.nextInt();

        int Arr[] = {x, y, z};
        Arrays.sort(Arr);
        for (int i = 0; i < 3; i++) {
            if (i == 2){
                System.out.println(Arr[i]);
                break;
            }else{
                System.out.print(Arr[i]);
                System.out.print(" ");
            }
        }
    }
}