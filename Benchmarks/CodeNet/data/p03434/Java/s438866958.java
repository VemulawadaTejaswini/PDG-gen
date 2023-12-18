

import java.util.Arrays;
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n+1];
        int b[]=new int[n+1];
        int Alice=0;
        int Bob=0;
        for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        for(int i=n;i>=1;i--){
            b[n-i+1]=a[i];
        }
        for(int i=1;i<=n;i++){
            if(i%2==1){
                Alice+=b[i];
            }
            else{
                Bob+=b[i];
            }
        }
        System.out.println(Alice-Bob);
    }
    
}
