import java.util.*;

class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner (System.in);
        
        int[] array = new int[5];
        
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
            if (array[i] == 0) {
                count = i + 1;
            }
        }
        

            System.out.println(count);
        
    }
}