import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i < 6; i++){
            int tmp = input.nextInt();
            if (tmp == 0){
                System.out.println(i);
                break;
            }
        }
    }
}