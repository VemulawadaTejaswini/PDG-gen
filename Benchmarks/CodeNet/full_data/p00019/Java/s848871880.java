import java.util.Scanner;

class Main{
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
 
    int number = in.nextInt();
 
    long factorial = number;
    for(int i = 1; i < number; i++){
        factorial = factorial*(number - i);
    }
 
    System.out.println(factorial);
    }
}