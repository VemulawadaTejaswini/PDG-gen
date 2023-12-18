import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String args[]){
        Scanner stdIn = new Scanner(System.in);
        
        //int a = stdIn.nextInt();
        int num[] = new int[3];
        //String s = stdIn.next();
        //char c[] = s.toCharArray();
        //boolean flag = true;
        for(int i = 0; i < 3; i++){
            num[i] = stdIn.nextInt();
        }
        
        Arrays.sort(num);
        
        System.out.println(num[2] * 10 + num[1] + num[0]);
        
        //System.out.println();
        //System.out.print();
    }
}
