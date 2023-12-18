import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cake=4;
        int dol=7;
        int sum=cake+dol;
        int x=input.nextInt();
        if(x>=1 && x<=100){
        if(x>=sum){
            System.out.println("Yes");
        }
        else
            System.out.println("No");
        }
    }
}