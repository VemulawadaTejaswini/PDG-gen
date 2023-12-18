import java.util.*;
public class Main{
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] A = new int[N];
        int Ago=0;
        int Bgo = 0;
        int ans=0;
        int anssub=0;
        for(int i=0;i<N;i++){
            A[i] = scan.nextInt();
        }
        for(int i=0;i<N;i++){
            int B = scan.nextInt();
            if(A[i]>=B){
                A[i]-=B;
            }else{
                anssub++;
                Bgo=Bgo+(B-A[i]);
                A[i]=0;
            }
        }
        Arrays.sort(A);
        int y=0;
        if(Bgo!=0){
            for (int p=1;p<=A.length;p++) {
                y = A[A.length-p];
                if(y==0){ans=-1;break;}
                Bgo-=y;
                anssub++;
                ans=anssub;
                if(Bgo<=0){
                    break;
                }
                ans=-1;
            }
        }
        System.out.println(ans);
	}
}