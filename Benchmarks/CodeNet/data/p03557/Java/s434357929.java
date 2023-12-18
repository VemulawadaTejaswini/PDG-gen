import java.util.*;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int a[] = new int[n];
        int b[] = new int[n];
        int c[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            b[i] = sc.nextInt();
        }
        for(int i = 0; i < n; i++){
            c[i] = sc.nextInt();
        }

        int count_a[] = new int[n];
        int count_b[] = new int[n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(b[i] < c[j]){
                    count_b[i]++;
                }
            }
        }
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(a[i] < b[j]){
                    sum += count_b[j];
                }
            }
        }
        System.out.println(sum);
    }
}