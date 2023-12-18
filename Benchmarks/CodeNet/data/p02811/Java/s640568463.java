import java.util.*;
public class a {
    public static void main(String[] args){
        Scanner scan = new Scanner(System. in);
        String s = scan.nextLine();
        String[] sarr = s.split(" ");
        int[] iarr = new int[2];
        for (int i = 0; i < sarr.length; i++){
            iarr[i] = Integer.parseInt(sarr[i]);
        }
        if (iarr[0]*500 >= iarr[1]) System.out.println("Yes");
        else System.out.println("No");
    }
}
