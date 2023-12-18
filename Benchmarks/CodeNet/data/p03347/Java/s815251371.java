import java.util.Scanner;

/**
 *
 * @author Suraj
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in =  new Scanner(System.in);
        int n=in.nextInt();
        long[] A= new long[n];
        for(int i =0;i<n;i++){
            A[i]=in.nextLong();
        }
        if(A[0]!=0){
            System.out.println("-1");
        }
        else{
            long count=0;
            for(int i =1;i<n;i++){
                if(A[i]==1){
                    count++;
                }
                else if(A[i]<=A[i-1]){
                    count++;
                }
                else{
                    count = count+A[i]-A[i-1];
                }
            }
            System.out.println(count);
        }
    }
}
