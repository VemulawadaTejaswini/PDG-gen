import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String[] b = a.split("");
        for (int i = 0; i <= 2; i++) {
            for (int j =i+1; j <= 4; j++) {
                if(j==4){
                    continue;
                }
                if (b[i].equals(b[j])) {
                    count++;
                }
            }
        }
        if (count == 2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
