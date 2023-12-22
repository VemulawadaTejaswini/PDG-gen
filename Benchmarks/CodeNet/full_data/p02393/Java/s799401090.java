import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[3];
        for(int i = 0; i < 3; i++){
            array[i] = sc.nextInt();
        }
        
        smallArray(array);
    }
    
    public static void smallArray(int array[]){
        Arrays.sort(array);
        for(int i = 0; i < 3; i++){
            if(i != 2){
                System.out.print(array[i] + " ");
                
            }else{
                System.out.println(array[i]);
            }
            
        }

    }
}
