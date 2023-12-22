import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n,i,j;
        n=input.nextInt();
        int[] a=new int[n];
        for(i=0; i<n; i++){
            a[i]=input.nextInt();
        }
        for(j=n-1; j>=0; j--){
            System.out.print(a[j]);
            if(j!=0) 
            System.out.print(" ");
        }
        System.out.println();
    }
}
