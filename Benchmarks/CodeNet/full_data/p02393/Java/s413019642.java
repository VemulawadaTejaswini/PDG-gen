import java.util.Scanner;
import java.util.Arrays;
 
public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int [] abc = new int[3];
         
        for(int i = 0; i < abc.length; i++){
            abc[i] = scan.nextInt();
        }
 		
        Arrays.sort(abc);
        System.out.println(abc[0] + " " + abc[1] + " " + abc[2]);
    }
}
