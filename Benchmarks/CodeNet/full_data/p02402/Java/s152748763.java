import java.util.Scanner;
import java.util.Arrays;

public class Main 
{
    
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        String Arr[] = str.split(" ");
        long Arr2[] = new long[a];
        long sum = 0;
        
        for(int i = 0; i < a; i++)
        {
            Arr2[i] = Integer.parseInt(Arr[i]);
            sum = sum + Arr2[i];
        }
        
        Arrays.sort(Arr2);
        
        System.out.println(Arr2[0] + " " + Arr2[a-1] + " " + sum);
        
    }
                
}
