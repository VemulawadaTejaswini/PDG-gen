import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c;
        String str = "";
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        if(a < b) {
            if(a < c) {
                str += a + " ";
                if(b < c) {
                    str += b + " " + c;
                } else {
                    str += c + " " + b;
                }
            } else {
                str += c + " ";
                if(a < b) {
                    str += a + " " + b;
                } else {
                    str += b + " " + a;
                }
            }
        } else {
            if(c < b) {
                str += c + " ";
                if(a < b) {
                    str += a + " " + b;
                } else {
                    str += b + " " + a;
                }
            } else {
                str += b + " ";
                if(a < c) {
                    str += a + " " + c;
                } else {
                    str += c + " " + a;
                }
            }
            System.out.println(str);
        }