//package basics.AtCoders;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String n=s.nextLine();
        int sum=0;
        for(int i=0;i<n.toString().length();i++){
            sum = sum + Integer.parseInt(String.valueOf(n.charAt(i)));;
        }
        System.out.println((sum%9==0)?"Yes":"No");
    }
}
