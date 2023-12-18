import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] splt = scanner.nextLine().split(" ");
        if(Integer.parseInt(splt[0])*500>=Integer.parseInt(splt[1])){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

}
