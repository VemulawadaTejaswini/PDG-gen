import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        int M = sc.nextInt();
        int a[] = new int[N];
        int b[] = new int[N];
        int sum = 0;
        for(int i=0;i<N;i++){
            a[i] = sc.nextInt();
            sum = sum+a[i];
        }
        Arrays.sort(a);
        for(int i=0;i<N;i++) {
        	b[i]=a[N-i-1];
        }
        boolean anst = true;
        for(int i=0;i<M;i++){
            if(b[i]<(sum/(4*M))){
                anst = false;
                break;
            }
        }
        if(anst)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
