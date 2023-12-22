import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        int N=stdIn.nextInt();
        long K=stdIn.nextLong();

        int m=1;
        
        int []a=new int[N];
        for(int i=0; i<N; i++){
            a[i]=stdIn.nextInt();
        }

        for(int i=0; i<K; i++){
            m=a[m-1];
        }
        
        System.out.println(m);
        
    }

}