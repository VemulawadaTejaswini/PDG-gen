import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int A=sc.nextInt();
        int B=sc.nextInt();
        int[] P=new int[N];
        for(int i=0;i<N;i++){
            P[i]=sc.nextInt();
        }
//        Arrays.sort(P);
        int n1=0;
        int n2=0;
        int n3=0;
        for(int i=0;i<N;i++){
            if(P[i]<=A){
                n1++;
                continue;
            }
            if(P[i]<=B){
                n2++;
                continue;
            }
            n3++;
        }
        int result=n1;
        if(result>n2){
            result=n2;
        }
        if(result>n3){
            result=n3;
        }

        System.out.println(result);
    }


}