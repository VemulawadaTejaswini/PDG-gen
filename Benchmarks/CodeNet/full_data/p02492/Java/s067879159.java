import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        while(true){
            int a = scan.nextInt();
            String mark = scan.next();
            int b = scan.nextInt();
 
            if(mark.equals("?")){
                break;
            }
 
            if(mark.equals("+")){
                System.out.println(a+b);
            }else if(mark.equals("-")){
                System.out.println(a-b);
            }else if(mark.equals("*")){
                System.out.println(a*b);
            }else if(mark.equals("/")){
                System.out.println(a/b);
            }
        }
    }
}