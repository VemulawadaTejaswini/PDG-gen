import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner stdIn=new Scanner(System.in);

        int N=stdIn.nextInt();
        int M=stdIn.nextInt();
        int []h=new int[N];
        int []a=new int[M];
        int []b=new int[M];
        int []c=new int[N];
        int sum=0;

        for(int i=0; i<N; i++){
            h[i]=stdIn.nextInt();
        }
        for(int i=0; i<M; i++){
            a[i]=stdIn.nextInt();
            b[i]=stdIn.nextInt();
        }
        
        for(int i=0; i<M; i++){
            if(h[a[i]-1]>h[b[i]-1]){
                c[b[i]-1]++;
            }
            else if(h[a[i]-1]<h[b[i]-1]){
                c[a[i]-1]++;
            }
            else{
                c[a[i]-1]++;
                c[b[i]-1]++;
            }
        }
        for(int i=0; i<c.length; i++){
            if(c[i]>=1){
                sum++;
            }
        }
        System.out.println(N-sum);
        
        
    }

}