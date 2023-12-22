import java.util.Scanner;
  
class Main {
    public static void main(String[] args) {
        int a, b;
        String s = "";
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if (a == b) {
            s += "==";
        } else if (a > b) {
            s += ">";
        } else {
            s += "<";
        }
        System.out.println("a "+ s +" b");
    }
}
