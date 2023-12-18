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
        int[] element = new int[n];
        int[] times = new int[n];
        int count = 0;
        for(int i =0;i<n;i++){
            element[i]=sc.nextInt();
            times[i] = sc.nextInt();
            count+=times[i];
        }
        //long[] arr = new long[count];
        count = 1;
        outer:for(int i = 0; i<n;i++)
        {
            for(int j = 0;j<times[i];j++)
            {
                if(count == k){
                    System.out.println(element[i]);
                    break outer;
                }
                //arr[count] = element[i];
                count++;
            }
        }
    }
}
            