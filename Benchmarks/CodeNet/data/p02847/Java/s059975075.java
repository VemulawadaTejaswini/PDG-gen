import java.util.*;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //int n = sc.nextInt();
        // int x = sc.nextInt();
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        String s = sc.next();
        String youbi[] = {"SUN","MON","TUE","WED","THU","FRI","SAT"};


        int day = 0;
        for(int n=0;n<7;n++){
            if(youbi[n].equals(s)){
                System.out.println(7-n);
            }
        }


    }
}
