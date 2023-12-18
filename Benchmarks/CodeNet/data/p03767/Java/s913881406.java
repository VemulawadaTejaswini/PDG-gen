import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int N=sc.nextInt(),a[]=new int[3*N];
        for(int i=0;i<3*N;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        long res=0;
        for(int i=N;i<2*N;i++){
            res+=a[i];
        }
        System.out.println(res);
    }
}
