import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N=scan.nextInt();
        int Q=scan.nextInt();
int S=0;
int A[]=new int[N];
       Map<Integer,Integer> p=new HashMap();
       for(int i=0;i<N;i++){
           A[i]=scan.nextInt();
           if(p.get(i)==0){p.put(A[i],1);}
       else{p.put(A[i],p.get(i)+1);
       }
       S=S+A[i];}
      int B[]=new int[Q];
        int C[]=new int[Q];

        for(int i=0;i<Q;i++){B[i]=scan.nextInt();
            C[i]=scan.nextInt();

           S=S+(B[i]-C[i])*p.get(B[i]);
           System.out.println(S);

       }


    }
}
