import java.util.Scanner;
             
class Main{
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] A = new int[n];
        int i;
        for(i=0; i<n; i++) A[i] = stdIn.nextInt();
        System.out.println(A);//printArray(A, n);
        int j, key;
        for(i=1; i<n-1; i++){
            key = A[i];
            j = i-1;
            while(j >= 0 && A[j] > key){
                A[j+1] = A[j];
                j--;
            }
            A[j] = key;
            System.out.println(A);//printArray(A, n);
        }
    }
            
/*    public static void printArray(int[] array, int num){
        int a;
        for(a = 0; a<(num-1); a++) System.out.print(array[a]+ " ");
        System.out.println(a[num-1]);
    }*/
}