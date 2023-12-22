import java.util.Scanner;
public class Main{

        int n,v,j;
        int[] A;
    public void run(){
        Scanner sc =  new Scanner(System.in);
            n = sc.nextInt();
            A = new int[n];
            
            for(int i=0; i < n; i++) A[i] = sc.nextInt();
        
            trace();
        
            //insetion sort
        for (int i=1;i<n;i++){
            v=A[i];
            j=i-1;
            while(j>=0&&A[j]>v){
                A[j+1]=A[j];
                j--;
            }
            A[j+1]=v;     
            trace();
        }
      
    }
        
        void trace(){         
                for (int i= 0;i<n;i++){
                    if (i > 0) System.out.print(" ");
                        System.out.print(A[i]);
                    }
                
                System.out.println();  
        }

           public static void main(String[] args){     
               new Main().run();
    } 
}