import java.util.*;
class Main{
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args){
        int N = sc.nextInt();
        int M = sc.nextInt();
        int a[] = new int[N];
        for(int i=0;i<N;i++){
            a[i] = sc.nextInt();
        }
        boolean anst = true;
        for(int i=0;i<M;i++){
            if(a[i]<(1/(4*M))){
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