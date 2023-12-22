import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n  = sc.nextInt();
        int[] array = new int[n];
        int temp = 0;
        int tempCount = 0;
        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }
        for(int i=1;i<=n-1;i++){
            for(int j=n-1;j>=i;j--){
                if(array[j] < array[j-1]){
                    tempCount++;
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
             }
        }
        for(int i=0;i<n;i++){
            System.out.print(array[i]);
            if(i<n-1){
                System.out.print(" ");
            }
        }
        System.out.println("");
        System.out.println(tempCount);
        sc.close();
    }
}
