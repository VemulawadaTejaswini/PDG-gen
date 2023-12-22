import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int r,c;
        r=sc.nextInt();
        c=sc.nextInt();
        
        int table[][]=new int[r+1][c+1];
        
        int sum;
        int i,j,k;
        for(i=0;i<r;i++){
            sum=0;
            for(j=0;j<c;j++){
                table[i][j]=sc.nextInt();
                sum+=table[i][j];
            }
            table[i][j]=sum;
        }
        for(j=0;j<c+1;j++){
            for(k=0;k<r;k++)table[i][j]+=table[k][j];
        }
        
        for(i=0;i<r+1;i++){
            for(j=0;j<c+1;j++){
                if(j==0)System.out.printf("%d",table[i][j]);
                else System.out.printf(" %d",table[i][j]);
            }
            System.out.printf("\n");
        }

    }
}
