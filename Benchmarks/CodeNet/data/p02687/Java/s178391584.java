import java.util.Scanner;
 
class Main{
 
    public static void main(String[] args){
 
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        scanner.close();
        if(s.equals("ABC")){
            System.out.println("ARC");
        }else{
            System.out.println("ABC");
        }
    }
 
}