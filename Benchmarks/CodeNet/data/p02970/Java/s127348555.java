import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int tree = sc.nextInt();
        int look = sc.nextInt();
        int people = 0;
        while (tree >= look * 2 + 1) {
            people++;
            tree -= look * 2 + 1;
        }
        if (tree > 0) {
            people++;
        }
        System.out.println(people);
    }
}
