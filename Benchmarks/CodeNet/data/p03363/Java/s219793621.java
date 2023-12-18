import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int a[] = new int[n];
        int cnt = 0;
        int sum = 0;
        
        for(int i = 0; i < n; i++){
            a[i] = stdIn.nextInt();
            sum += a[i];
        }
        if(sum == 0)
            cnt++;

        for(int i = 2; i < n; i++){
            for(int j = 0; j < n - i + 1; j++){
                sum = 0;
                for(int k = j; k < j + i; k++)
                    sum += a[k];
                if(sum == 0)
                    cnt++;
            }
        }

                
        System.out.println(cnt);
    }
}