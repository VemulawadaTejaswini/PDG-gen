import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int loop = sc.nextInt();
        int intArray[] = new int[loop];

        int index = 0;
        
        for(int i = 0;i < loop;i++) {
             intArray[i] = sc.nextInt();

             if (intArray[i] % 2 != 0) {
                break;
             } else if (intArray[i] % 2 == 0) {
                 index+=1;
             }

            
        }

        System.out.println(index);

        sc.close();
    }
    
}