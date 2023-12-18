import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String lastWeek = sc.next();
        if(lastWeek.equals("ABC")){
            System.out.print("ARC");
        }else{
            System.out.print("ABC");
        }
    }

}
