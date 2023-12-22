import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);

        String a = stdIn.next();

        //文字列を小文字に
        if(a.toLowerCase() == a){
            System.out.println("a");
        }else {
            System.out.println("A");
        }
    } 
}