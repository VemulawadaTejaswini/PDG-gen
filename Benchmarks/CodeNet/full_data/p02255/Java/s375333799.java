import java.util.Scanner;
 
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int [n];
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        doing(array, n);
 
    }
 
   static void doing(int[] array, int n){;
        for(int i = 0; i < n; i++){
            int value = array[i];
            int j = i -1;
 
            while (j >= 0 && array[j] > value){
                array[j+1] = array[j];
                j--;
            }
            array[++ j] = value;
            
            
            
            
            for (j = 0; j < n; j++){
                System.out.print(array[j]);
                if (j != n-1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}