import java.util.Scanner;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer n = Integer.parseInt(scan.next());
        Integer d = Integer.parseInt(scan.next());
 
        int x = n/(2*d+1);
        int mod = n%((2*d+1));

        if(mod == 0)
            System.out.println(n/(2*d+1));
        else
            System.out.println(n/(2*d+1)+1);
    }
}