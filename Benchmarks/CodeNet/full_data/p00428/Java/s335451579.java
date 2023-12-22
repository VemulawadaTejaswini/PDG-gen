import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        int m;
        while((n=sc.nextInt())!=0 && (m=sc.nextInt())!=0){
            int q[] = new int[m];
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    q[j] += sc.nextInt();                    
                }
            }

            int max = q[0];
            for(int j=1;j<m;j++){
                if(max<q[j]) max = q[j];
            }
            for(int i=max;i>=0;i--){
                for(int j=0;j<m;j++){
                    if(i==q[j]){System.out.print(j+1 + " ");}
                }
            }
            System.out.println();
        }
    }
}
