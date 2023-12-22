import java.util.Scanner;
class Main{
    public static void main(String[]arge){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []A=new int[n];
        for(int i=0; i<n; i++){
            A[i]=sc.nextInt();
        }
        
        for(int i=0; i<n; i++){
             int v=A[i];
             int j=i-1;
             while(j>=0 && A[j]>v){
                 A[j+1]=A[j];
                 j--;
             }
             A[j+1]=v;

             for(int k=0; k<n; k++){
                if(k>0)System.out.print(" ");
                System.out.print(A[k]);
             }
             System.out.println();
        }
       

        
    }
}     