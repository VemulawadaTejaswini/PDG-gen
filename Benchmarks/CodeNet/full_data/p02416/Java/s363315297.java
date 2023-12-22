import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int sum;
        String str;
        String[] strArray;
        Scanner sc = new Scanner(System.in);
        str = sc.next();

        while (str.charAt(0) != '0') {
            strArray = str.split("");
            sum = 0;
            for(String s : strArray) 
                sum += Integer.parseInt(s);
            System.out.println(sum);
            str = sc.next();
        }
    }
}
