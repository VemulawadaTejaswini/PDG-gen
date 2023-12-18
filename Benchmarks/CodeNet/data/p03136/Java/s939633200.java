import java.util.*;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        int max = 0;
        int sum = 0;
        for(int i=0; i<n; i++){
            array[i] = sc.nextInt();
            if(max < array[i]){
                max = array[i];
            }
            sum += array[i];
        }
        if((sum-max) > max) System.out.println("Yes");
        else System.out.println("No");
    }
}