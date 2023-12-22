import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        String s = r.nextLine();
        String s2 =  r.nextLine();
        int a = Integer.parseInt(s);
        int b = Integer.parseInt(s2); 

        System.out.println(a*b + " " + (2*a+2*b));
    }
}