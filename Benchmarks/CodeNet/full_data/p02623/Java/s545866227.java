import java.util.*; 
import java.lang.*; 


public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
                
                long N = scan.nextLong();
                long M = scan.nextLong();
                long K = scan.nextLong();
               
                ArrayList<Long> A = new ArrayList<>();
                ArrayList<Long> B = new ArrayList<>();
                A.add((long)0);
                B.add((long)0);
                for(int i=1; i<=N;i++){
                        long P = scan.nextLong();
                        A.add(A.get(i-1)+P);
                }
                for(int i=1; i<=M;i++){
                        long Q = scan.nextLong();
                        B.add(A.get(i-1)+Q);
                }
                long ans = 0;
                long bn = M;
                long i=0;
                while(i<=N&&A.get((int)i)<=K){
                    for(long j=bn; bn>=0;j--){
                        if(A.get((int)i)+B.get((int)j)<=K){
                            ans = Math.max(ans,i+j);
                            bn = j;
                            break;
                        }
                    }
                    i++;
                }
                System.out.println(ans);               
        }               
}