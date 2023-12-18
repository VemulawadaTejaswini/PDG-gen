import java.util.Scanner;

public class Main {
    public static void main(String...args){
        Scanner scanner=new Scanner(System.in);
        char next =scanner.next().charAt(0);
        if(next=='z'){
            System.out.println("z");
        }
        int u=(int)next;
        u=u+1;
        char result=(char)u;
        System.out.println(result);
    }
}

