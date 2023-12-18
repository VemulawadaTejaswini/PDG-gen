import java.util.Scanner;
/**
 * Write a description of class nandk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int x = 0;
        int y =0;
        long sum = 0;
        for(int i =0;i<n;i++){
            x=sc.nextInt();
            y = sc.nextInt();
            sum+=y;
            if(k <= sum){
                System.out.println(x);
                break;
            }
        }
    }
}    