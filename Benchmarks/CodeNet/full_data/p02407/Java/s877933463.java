import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
 
        int N=sc.nextInt();
        int a[]=new int[N];
        
        for(int i=0;i<N;i++){
            a[i]=sc.nextInt();
        }
        
        for(int i=0;i<N;i++){
            System.out.print(a[N-1-i]);
            if(!(i==N-1)){
                System.out.print(" ");
            }
        }
         System.out.println("");
        
    }
}
