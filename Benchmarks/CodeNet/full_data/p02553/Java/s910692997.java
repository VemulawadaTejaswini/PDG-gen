import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();
        int ansList[] = {a*c, a*d, b*c, b*d};
        int max = ansList[0];
        for(int i=0; i<ansList.length; i++) {
            if (max<ansList[i]) {
                max=ansList[i];
            }
        }
        System.out.println(max);
    }
}
