import java.util.*;
public class Main {
	public static void main(String[] args)  {
        Scanner scan =new Scanner(System.in);
        String s=scan.next();
        long k=Long.parseLong(scan.next());

        if (s.charAt(0)=='1'){
            System.out.println(s.charAt(1));
        }else{
            System.out.println(s.charAt(0));
        }


}
}
//end