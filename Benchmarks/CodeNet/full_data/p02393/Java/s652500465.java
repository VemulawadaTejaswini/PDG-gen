import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        int n[];
        n = new int [3];
        int temp;
        String s = "";
        Scanner sc = new Scanner(System.in);
        n[0] = sc.nextInt();
        n[1] = sc.nextInt();
        n[2] = sc.nextInt();

        for (int i = 0;  i < 2 ;i++) {
            if (n[i] > n[i + 1]) {
                 temp =n[i];
                 n[i] = n[i + 1];
                 n[i + 1] = temp;
            }
        }
        if (n[0] > n[1]) {
                 temp =n[0];
                 n[0] = n[1];
                 n[1] = temp;
        }
        System.out.println(n[0] + " " + n[1] + " " + n[2]);
    }
}
