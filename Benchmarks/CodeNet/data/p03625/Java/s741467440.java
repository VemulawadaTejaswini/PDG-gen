import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[]A=new int[N];
        for(int i=0;i<N;i++){
            A[i]=sc.nextInt();
        }
        Arrays.sort(A);
        Set<Integer>youso=new HashSet<Integer>();
        for(int i=0;i<N-1;i++){
            if(A[i]==A[i+1]){
                youso.add(A[i]);
            }
        }
        int max=0;
        for(int a:youso){
            if(max<a){
                max=a;
            }
        }
        int maxx=0;
        for(int a:youso){
            if((maxx<a)&&(a<max)){
                maxx=a;
            }
        }
        System.out.println(max);
        System.out.println(maxx);
        System.out.println(max*maxx);
        }
       
        
    }