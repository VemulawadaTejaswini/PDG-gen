import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        String c = b.substring(b.length() - 1);
        
        if(b.equals(a + c)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}