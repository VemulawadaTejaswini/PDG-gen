import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tate = sc.nextLong();
        long yoko = sc.nextLong();
        long result = 0;
        if (tate == 1 || yoko == 1){
            result = 1;
        } else if(tate % 2 == 0){
            result = (tate / 2) * yoko;
        } else {
            for (int i = 1; i <= yoko; i++){
                if (i % 2 != 0){
                    result = result + (tate / 2) + 1;
                }else{
                    result = result + (tate / 2);
                }
            }
        }
        System.out.println(result);

    }
}
