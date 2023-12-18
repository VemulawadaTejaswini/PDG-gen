import java.util.Scanner;
public class Main
{
    public static void main(String args[])
        {
            Scanner s = new Scanner(System.in);
            int days = s.nextInt(); 
            int arr[][] = new int[days][3];
            for(int i=0;i<days;i++)
                {
                    for(int j=0;j<3;j++)
                        {
                            arr[i][j] = s.nextInt();
                        }
                }
            solver(arr,days);
        }
    private static void solver(int arr[][],int days)
        {
            int max = Integer.MIN_VALUE;
            for(int i=0;i<days;i++)
                {
                    for(int j=0;j<3;j++)
                        {
                            if(i==0)
                                {
                                    max = Math.max(arr[i][j],max);
                                    continue;
                                }
                            else
                                {
                                    arr[i][j] = helper(arr,i-1,j)+arr[i][j];
                                }
                            max = Math.max(arr[i][j],max);
                            System.out.println(max);
                        }
                }
            System.out.println(max);
        }
    private static int helper(int arr[][],int row,int col)
        {
            int max = Integer.MIN_VALUE;
            for(int i=0;i<arr[0].length;i++)
                {
                   if(i!=col) max = Math.max(arr[row][i],max);
                }
            return max;
        }
}
