import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Main m = new Main();
        m.q3();

    }

    void q3()
    {
        Scanner scan = new Scanner(System.in);
        int N = Integer.parseInt(scan.next());
        int[] a = new int[N-1];

        for(int i = 0 ; i < N-1;i++)
        {
            a[i] = Integer.parseInt(scan.next());
        }

        for(int i = 0; i < N; i++){
            int sum = 0;
            for(int k = 0; k < N-1; k++){
                if(i + 1 == a[k])sum++;
            }
            System.out.println(sum);
        }
    }

    

}
