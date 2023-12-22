import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner r = new Scanner(System.in);
        String s = r.nextLine();
        int x = Integer.parseInt(s);
        x = x*x*x;
        
        System.out.println(x);
    }
}