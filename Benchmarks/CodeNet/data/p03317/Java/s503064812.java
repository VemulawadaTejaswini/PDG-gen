import java.util.*;
 
public class Main {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int K=sc.nextInt();
        int[] ar=new int[N];
        for(int i=0;i<N;i++){
            ar[i]=sc.nextInt();
        }
        int i=0,j=0,x=0,z=0;
        while(i<N){
            int count=0;
            //System.out.println("Hello");
            j=z;
            while(count<K){
                //System.out.println("Hello1");
                j++;
                //System.out.println("j="+j);
                count++;
                //System.out.println("count="+count);
            }
            //System.out.println("ABC");
            x+=1;
            z=j;
            //System.out.println("z="+z);
            if(i+K-1<=N-1){
                i=z;
                //System.out.println("i="+i);
            }
            else{
                break;
            }
            if(i==N-1){
                break;
            }
        }    
        if(N%K==0){
            System.out.println(x);
        }
        else{
            System.out.println(x+1);
        }
    }
}