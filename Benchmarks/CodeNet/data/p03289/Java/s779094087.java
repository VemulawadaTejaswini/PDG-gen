import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String mes = sc.nextLine();
        int count = 0;
        boolean flag1 = false;
        boolean flag2 = false;
        boolean flag3 = false;
        if (mes.charAt(0) == 'A') {
            flag1 = true;
        }
        for (int i = 2; i < mes.length() - 1; i++) {
            if (mes.charAt(i) == 'C') {
                count++;
            }
        }
        if (count == 1) {
            flag2 = true;
        }
        String MES = mes.toUpperCase();
        int check = 0;
        for (int i = 0; i < mes.length(); i++) {
            if (MES.charAt(i) == mes.charAt(i)) {
                check++;
            }
        }
        if (check == 2) {
            flag3 = true;
        }
        if (flag1 && flag2 && flag3) {
            System.out.println("AC");
        } else {
            System.out.println("WA");
        }
    }
}