import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Long s = Long.parseLong(scan.next());

        if(s%2==0){
            System.out.print("0 0 2 0");
            System.out.println(" 0 " + (s/2));
        }else{ 
            System.out.print("0 0 1 0");
            System.out.println(" 0 " + s);
        }
    }
}