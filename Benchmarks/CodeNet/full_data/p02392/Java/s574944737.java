import java.util.Scanner;
import java.util.InputMismatchException;
class Main{
public static void main(String args[]){

    Scanner scan = new Scanner(System.in);
    try{
int a = scan.nextInt();
int b = scan.nextInt();
int c = scan.nextInt();

if(a<b && b<c){

System.out.println("Yes");
}


else{

System.out.println("No");
}










}catch (InputMismatchException e) {
        	System.out.println("try again!!");
        }





}
}

