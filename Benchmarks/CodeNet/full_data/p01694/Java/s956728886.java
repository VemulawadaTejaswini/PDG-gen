import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        List<String> strList = new ArrayList<String>();
        
        Scanner scan = new Scanner(System.in);
         String num1 = scan.nextLine();
        String asi = scan.nextLine();
        int kaisu = Integer.parseInt(num1);
        System.out.println(num1);
        System.out.println(asi);
        String a[] = asi.split(" ");
        int count=0;
        boolean right_foot = false;
        boolean left_foot = false;
        for (int i=0; i<kaisu; i++) {
            if(a[i].equals("ru")) {
                right_foot = true;
            } else if (a[i].equals("rd")) {
                right_foot = false;
            } else if (a[i].equals("lu")) {
                 left_foot = true;
            } else if (a[i].equals("ld")){
                left_foot = false;
            }
            
            if(right_foot == left_foot) {
                count +=1;
            }
        }
        System.out.println(count);

    }
}
