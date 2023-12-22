//package ACL;
/*
Name       :  Md. Tanver Ahammed
Institution:  Mawlana Bhashani Science and Technology University(MBSTU)
Dept.      :  ICT
Language   :  JAVA
*/
//A Repeat ACL

import java.util.Scanner;

public class Main {
    private static void DisplayACL(int n){
        String st = "ACL";
        for (int i = 0; i < n-1; i++) {
            System.out.print(st);
        }
        if (n>0)
            System.out.println(st);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            DisplayACL(scanner.nextInt());
        }
    }
}
