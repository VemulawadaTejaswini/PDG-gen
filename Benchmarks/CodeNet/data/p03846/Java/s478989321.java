import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        long count = 0;
        
        for (int i=0; i<n; i++){
            if (a[i] != 0){
                for (int j=i+1; j<n; j++){
                    if (a[i] == a[j]){
                        count += 1;
                    }
                } 
            }
        }
        count *= count;
        count = count % (1000000000+7);

        if (n % 2 != 0 && count+1 != n){
            count = 0;
        }
        
        

        System.out.println(count);
        
        
    }

}
