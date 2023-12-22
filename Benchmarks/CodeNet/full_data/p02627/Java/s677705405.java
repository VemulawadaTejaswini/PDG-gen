import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char letter = sc.next().charAt(0);

        if(letter>='A' && letter <= 'Z'){
            System.out.println("A");
        }
        else{
            System.out.println("a");
        }



    }
}