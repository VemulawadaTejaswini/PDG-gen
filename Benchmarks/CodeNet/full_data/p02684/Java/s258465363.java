import java.util.*;

class Main{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[]){
        int N=sc.nextInt(),p=1,c=0,l=0;
        long K=sc.nextLong();
        int[] m=new int[N+1],t=new int[N+1];
        ArrayList<Integer> r=new ArrayList<>();
        Arrays.fill(m,-1);
        Arrays.fill(t,-1);
        for(int i=1;i<=N;i++){
            m[i]=sc.nextInt();
        }
        while(true){
            if(t[p]!=-1){
                l=c-t[p];
                if(K<c){
                    System.out.println(r.get(p));
                }
                else{
                    System.out.println(r.get(t[p]+(int)((K-c)%l)));
                }
                break;
            }
            t[p]=c;
            c++;
            r.add(p);
            p=m[p];
        }
    }
}
