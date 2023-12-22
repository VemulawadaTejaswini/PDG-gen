import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();

        if(s.length() + 1 == t.length() && s.length() >= 1 && s.length() <= 10 && t.substring(0, t.length()-1).equals(s) == true){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}