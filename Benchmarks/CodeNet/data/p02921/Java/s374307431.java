import java.util.Scanner;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.PriorityQueue;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        
        String  s  = stdIn.next();
        String  t  = stdIn.next();
        
        String[] ss = s.split("");
        String[] tt = t.split("");

        int count = 0;
        for(int i = 0;i < 3; i++) {
            if(ss[i].equals(tt[i])){
                count++;
            }
        }

        
        System.out.println(count);

        
    }

}