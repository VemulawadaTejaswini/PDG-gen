import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        int M = sc.nextInt();
        int a[] = new int[N];
        int sum = 0;
        for(int i=0;i<N;i++){
            a[i] = sc.nextInt();
            sum = sum+a[i];
        }
        Arrays.list(a);
        boolean anst = true;
        for(int i=0;i<M;i++){
            if(a[M-(i+1)]<(sum/(4*M))){
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