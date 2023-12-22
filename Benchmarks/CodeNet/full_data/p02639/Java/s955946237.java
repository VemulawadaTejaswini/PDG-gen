import java.util.Scanner;
public class CP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            if(sc.nextInt()==0){
                System.out.println(i+1);
            }
        }
    }
}