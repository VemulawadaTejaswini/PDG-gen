import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        String line1 = sc.nextLine();
        String[] array = line1.split(" ");
        
        int n = Integer.parseInt(array[0]);
        int k = Integer.parseInt(array[1]);
        
        int[] sunuke = new int[n];
        
        for(int i = 0; i < k; i++)
        {
            String buf1 = sc.nextLine();
            int ninzu = Integer.parseInt(buf1);
            String buf2 = sc.nextLine();
            String[] okasimoti = buf2.split(" ");
            
            for(int j = 0; j < ninzu; j++)
            {
                int buf3 = Integer.parseInt(okasimoti[j]);
                sunuke[buf3 - 1]++;
            }
        }
        
        int count = 0;
        for(int i = 0; i < n; i++)
        {
            if(sunuke[i] == 0)
            {
                count++;
            }
        }
        
        
        System.out.println(count);
    }
}
