import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String input1 = input.nextLine();
        String[] str = input1.split(" ");
        int a = Integer.parseInt(str[0]);
        int b = Integer.parseInt(str[1]);
        int c = a/b;
        int d = a%b;
        double e = (double)a/(double)b;
        System.out.println(c + " " + d + " " + e);
    }
}
