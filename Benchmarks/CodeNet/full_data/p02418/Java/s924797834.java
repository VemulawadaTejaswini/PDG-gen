import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.nextLine();
        String s2 = scn.nextLine();

        String ring = s1 +s1;

        if(ring.contains(s2)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }


        scn.close();


    }



}
