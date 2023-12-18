import java.util.*;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n = sc.nextInt();
  
        int array[] = new int[100100];
 
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num != 0) {
                array[num - 1]++;
            }
            array[num]++;
            array[num + 1]++;
        }

        int max = 0;
 
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
 
        System.out.println(max);
 
        sc.close();
 
        }
 
    }