import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        Stiring str =sc.next();

        if(str == "ABC" ){
            System.out.println("ARC");
        }
        else if(str =="ARC"){
            System.out.println("ABC");
        }
    }
}