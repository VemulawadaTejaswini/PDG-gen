import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String data1 = sc.nextLine();
        String data2 = sc.nextLine();
        
        int n = Integer.parseInt(data1);
        
        String[] array2 = data2.split(" ");
        
        int[] shain = new int[n];
        
        for(int i = 0; i < array2.length; i++)
        {
            int buf = Integer.parseInt(array2[i]);
            shain[buf - 1] ++;
        }
        
        for(int j = 0; j < n; j++)
        {
            System.out.println(shain[j]);
        }
        
    }
}
