import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n=sc.nextInt()%39;
            System.out.printf("3C%02d\n",n==0?39:n);;
        }
    }
}
