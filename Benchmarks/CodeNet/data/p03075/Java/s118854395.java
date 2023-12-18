import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] A = new int[6];
        
        for(int i=0; i<6; i++)
            A[i] = sc.nextInt();
        
        Arrays.sort(A);
        
        System.out.println(A[5]-A[0]<=15? "Yay!":":(");
    }
}
