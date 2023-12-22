import java.util.*;

class Main{
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Main(){
        int[] array = new int[n];
        for ( int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        for ( int j = n-1 ; j >= 0; j--){
            System.out.print(array[j]);
            if (j != 0 ){
                System.out.print(" ");    
            }    
        }
        System.out.print("\n");
    }
    public static void main(String[] args){
        new Main();
    }
}
