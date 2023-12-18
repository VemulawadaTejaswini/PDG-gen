import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] ary = new int[n];
        int[] ary_ex = new int[n - 1];
        int[] ary_ex_cp = new int[n - 1];

        for(int i = 0; i < n; i++)
            ary[i] = stdIn.nextInt();

        for(int j = 0; j < n - 1; j++){
            ary_ex[j] = ary[j + 1];
            ary_ex_cp[j] = ary[j + 1];
        }
        
        java.util.Arrays.sort(ary_ex);            
        System.out.println(ary_ex[n / 2 - 1]);
                       
        for(int i = 0; i < n - 1; i++){
            ary_ex_cp[i] = ary[i];

            for(int j = 0; j < n - 1; j++)
                ary_ex[j] = ary_ex_cp[j];
                        
            java.util.Arrays.sort(ary_ex);
            System.out.println(ary_ex[n / 2 - 1]);
        }
    }
}