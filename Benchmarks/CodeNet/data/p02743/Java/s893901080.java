import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();

        if (Math.sqrt(a) + Math.sqrt(b) < Math.sqrt(c)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}