import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int sum = Z;

        for(int i=1; i<=100000; i++){
            sum += Y + Z;
            if(sum>X){
                System.out.println(i-1);
                break;
            }
            else if(sum==X){
                System.out.println(i);
                break;
            }
        }
    }
}