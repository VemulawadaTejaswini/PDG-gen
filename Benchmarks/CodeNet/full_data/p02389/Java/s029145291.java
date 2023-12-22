import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        String s = r.nextLine();
        int a = Integer.parseInt(s);
        
        Scanner r2 = new Scanner(System.in);
        String s2 = r.nextLine();
        int b = Integer.parseInt(s);

        
        System.out.println(a*b + " " + (2*a+2*b));
    }
}