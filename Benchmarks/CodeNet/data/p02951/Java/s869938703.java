import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        Integer A = Integer.parseInt(scan.next());
        Integer B = Integer.parseInt(scan.next());
        Integer C = Integer.parseInt(scan.next());

        if(C<=(A-B)){
            System.out.println(0);
        }else{
            System.out.println(C-(A-B));
        }

    }
}
