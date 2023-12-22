import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        Scanner myObj = new Scanner(System.in);
        Integer x = Integer.valueOf(myObj.nextLine());
        if(x==0){
            System.out.println(1);
        }else{
            System.out.println(0);
        }
    }
}