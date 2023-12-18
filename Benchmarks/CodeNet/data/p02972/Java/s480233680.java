import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
		int[] x = new int[n];
        for(int i = 0; i<n; i++)
        {
            a[i] = sc.nextInt();
          	x[i] = 0;
        }

        int count = 0;
        int sum = 0;
        List<Integer> b = new ArrayList<>();

        for(int i = n; i > 0; i--){
            sum = 0;
            for(int j=2; j < n-1;j++){
              if(j*i > n){
                break;
              }
              else{
              	sum = sum + x[i*j];
              }
            }
            sum = sum%2;

            if(sum!=a[i]){
              	x[i] = 1;
                b.add(i+1);
            }
        }

        System.out.println(b.size());
        for(int i = 0; i < b.size(); i++)
        {
            if(i == b.size()-1)
            {
                System.out.println(b.get(i));
            }
            else
            {
                System.out.print(String.valueOf(b.get(i)) + " ");
            }
        }
        
    }
}