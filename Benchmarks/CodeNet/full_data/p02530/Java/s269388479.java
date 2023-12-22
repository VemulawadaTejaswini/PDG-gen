import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int a = 0, b = 0;
        while (n-- > 0){
            String as = input.next(), bs = input.next();

            if (as.compareTo(bs) > 0){
                a += 3;
            }
            else if (bs.compareTo(as) > 0){
                b += 3;
            }
            else {
                a++;
                b++;
            }
        }
        System.out.println(a + " " + b);
    }
}