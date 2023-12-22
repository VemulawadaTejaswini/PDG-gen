import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
      	int n = sc.nextInt();
      	int r = (int)(a*n/b) - a * (int)(n/b);
            System.out.println(r);
    }
}