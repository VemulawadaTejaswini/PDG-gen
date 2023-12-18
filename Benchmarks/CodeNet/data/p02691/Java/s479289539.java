import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Main {



    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int count =0;
            for(int i=0;i<n;i++)
            {
                for(int j=i+1;j<n;j++)
                {
                    int a =arr[j]+arr[i];

                    if(a==(j-i))
                    {
                        count=count+1;
                    }
                }
            }

            System.out.println(count);


    }


}