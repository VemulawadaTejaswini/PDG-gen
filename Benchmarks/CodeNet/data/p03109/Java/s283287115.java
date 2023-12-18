import java.util.*;
 
public class Main{
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next().substring(5, 7);
        int ss = Integer.parseInt(s);
        if(ss>4){
            System.out.println("TBD");
        }else{
            System.out.println("Heisei");
        }
    }
}
