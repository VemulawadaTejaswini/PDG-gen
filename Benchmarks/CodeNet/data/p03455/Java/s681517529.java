import java.util.Scanner;

class sampleClass{

    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        int a = scan.next();
        int b = scan.next();

        int answer = a * b;
        if(answer % 2){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }

    }
    
}
