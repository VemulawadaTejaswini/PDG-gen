import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, l;
        n = sc.nextInt();
        l = sc.nextInt();
       
        int[] aji = new int[n];
        int minIndex = 0;
        for(int i=0; i<n;i++)
        {
            aji[i] = l+i;
            if(i > 0){
                if(Math.abs(aji[i]) < Math.abs(aji[minIndex]))
                {
                    minIndex = i;
                }
            }
        }

        int sum = 0;
        for(int i=0; i<n;i++){
            if(i != minIndex)
            {
                sum += aji[i];
            }
        }
        System.out.println(sum);
        
        
    }
}

