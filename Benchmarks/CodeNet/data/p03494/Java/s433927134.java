import java.util.Scanner;

//-------------------------
// 
//-------------------------

public class Main {
    public static void main(String[] args) {
        boolean isTrue = true;
        int count = 0;

        Scanner scan = new Scanner(System.in);

        int N = Integer.parseInt(scan.next());

        int[] A = new int[N];
        for(int i=0; i<N; i++)
        {
            A[i] = Integer.parseInt(scan.next());
        }

        scan.close();
        
        while(true)
        {
            for(int i=0; i<N; i++)
            {
                if(A[i]%2 != 0) isTrue = false;
            }

            if(isTrue)
            {
                count++;
                for(int i=0; i<N; i++) A[i] = A[i]/2;
            }
            else
            {
                System.out.println(count);
                break;
            }
        }
    }
}