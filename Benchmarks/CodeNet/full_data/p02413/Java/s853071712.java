import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int num[][] = new int[r+1][c+1];
        for(int i = 0 ; i < r+1 ; i++)
        {
            for(int j = 0 ; j < c+1 ; j++)
            {
                if(i == r || j == c)
                    num[i][j] = 0;
                else
                    num[i][j] = sc.nextInt();
            }
        }
        for(int i = 0 ; i < r ; i++)
        {
            for(int j = 0 ; j < c ; j++)
                num[i][c] += num[i][j];
        }
        for(int i = 0 ; i < c ; i++)
        {
            for(int j = 0 ; j < r ; j++)
                num[r][i] += num[j][i];
            num[r][c] += num[r][i];
        }
        for(int i = 0 ; i < r+1 ; i++)
        {
            for(int j = 0 ; j < c ; j++)
                System.out.print(num[i][j] + " ");
            System.out.println(num[i][c]);
        }
    }
}
