import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int[] a=new int[N+1];
        int[] b=new int[N+1];
        for(int i=0;i<N;i++){
            a[i+1]=sc.nextInt();
            b[i+1]=sc.nextInt();
        }
        ArrayList<Integer> array=new ArrayList<Integer>();
        for(int i=0;i<N;i++){
            for(int j=1;j<=b[i+1];j++){
                array.add(a[i+1]);
            }
        }
        Collections.sort(array);
        int c=array.get(K);
        System.out.println(c);
    }
}