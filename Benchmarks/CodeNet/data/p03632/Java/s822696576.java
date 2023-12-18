import java.util.Scanner;

public class Main {

    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        int Alice_start = sc.nextInt();
        int Alice_end =sc.nextInt();
        int Bob_start =sc.nextInt();
        int Bob_end =sc.nextInt();
        if(Alice_end<=Bob_start || Bob_end <=Alice_start){
            System.out.println(0);
        }else if(Alice_start < Bob_start){
            System.out.println(Math.abs(Alice_end-Bob_start));
        }else{
            System.out.println(Math.abs(Bob_end-Alice_start));
        }
    }
}