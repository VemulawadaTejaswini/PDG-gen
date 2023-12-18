import java.util.Scanner;

public final class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        
        int n = stdIn.nextInt();
        int[] d = new int[n];
        for(int i=0; i<n; i++){
            d[i] = stdIn.nextInt();
        }

        for(int i=0; i<n; i++){
            int min = d[i];
            int idx = i;
            for(int j=i+1; j<n; j++){
                if(d[j]<min){
                    min = d[j];
                    idx = j;
                }
            }
            d[idx] = d[i];        
            d[i] = min;
        }

        if(n%2 == 1){
            System.out.println(0);
        }else{
            System.out.println(d[n/2] - d[n/2-1]);
        }
    }
}