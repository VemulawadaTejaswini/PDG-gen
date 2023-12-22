import java.util.Scanner;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int z = sc.nextInt();
        int h = z/60/60;
        int m = (z/60)%60;
        int s = z%60;
        System.out.printf("%s:%s:%s\n",h,m,s);
    }
}
