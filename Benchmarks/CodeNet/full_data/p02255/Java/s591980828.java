import java.util.Scanner;

class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        for(int i = 0; i < N; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < N; i++){
            Narabekae(i,a);
            for(int j = 0; j < N; j++){
                if(j != N-1){
                    System.out.print(a[j]+" ");
                }else{
                    System.out.println(a[j]);
                }
            }
        }
    }
    
    private static void Narabekae(int i, int a[]){
        for(int x = i; x > 0; x--){
            if(a[x-1] > a[x]){
                int a0;
                a0 = a[x-1];
                a[x-1] = a[x];
                a[x] = a0;
            }
        }
    }
}
