import java.util.*;
 

public class Main {
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        if(s=="111")
        System.out.println(3);
        else if(s=="011"||s=="101"||s=="110")
        System.out.println(2);
        else if(s=="000")
        System.out.println(0);
        else if(s=="100"||s=="010"||s=="001")
        System.out.println(1);


		
    }
}

