import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        String[] sum = {"SUN","MON","TUE","WED","THU","FRI","SAT"};


        String n = cin.next();

        // System.out.println(n instanceof String);


        // System.out.println(sum[6] instanceof String);


        for(int i=0;i<7;i++){
            // System.out.println(sum[i]);

            if(sum[i].equals(n)){
                System.out.println(7-i);
            }
        }
    }
}