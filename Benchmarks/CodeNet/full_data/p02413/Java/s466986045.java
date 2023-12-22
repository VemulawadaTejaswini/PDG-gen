import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int matrix[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        int rc_sum=0;
        for(int i=0;i<r;i++){
            int c_sum=0;
            for(int j=0;j<c;j++){
                System.out.print(matrix[i][j]+" ");
                c_sum+=matrix[i][j];
                if(i!=0)matrix[i][j]+=matrix[i-1][j];
            }
            System.out.println(c_sum);
            rc_sum+=c_sum;
        }
        for(int j=0;j<c;j++){
            System.out.print(matrix[r-1][j]+" ");
        }
        System.out.println(rc_sum);
    }
}

