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

        for(int i = 0; i < n - 1; i++){          
            for(int j = 2; j < n - i + 1; j++){
                sum = 0;
                for(int k = 0; k < j; k++)
                    sum += a[i + k];
                if(sum == 0){
                    cnt++;
                    j++;
                }
            }
        }
                
        System.out.println(cnt);
    }
}