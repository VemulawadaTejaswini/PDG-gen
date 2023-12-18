
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        long C=scanner.nextLong();
        long[] places=new long[N];
        long[] placesRev=new long[N];
        long[] cal=new long[N];
        for(int i=0;i<N;i++){
            places[i]=scanner.nextLong();
            placesRev[N-i-1]=C-places[i];
            cal[i]=scanner.nextLong();
        }
        long[] OA=new long[N];
        long[] OB=new long[N];
        long sumOA=0;
        long sumOB=0;
        for(int i=0;i<N;i++){
            sumOA+=cal[i];
            sumOB+=cal[N-i-1];
            OA[i]=sumOA;
            OB[i]=sumOB;
        }
        /*
        System.out.print("OA:");
        Arrays.stream(OA).forEach((long i)->{
            System.out.print(i+",");
        });
        System.out.println();
        System.out.print("OB:");
        Arrays.stream(OB).forEach((long i)->{
            System.out.print(i+",");
        });
        System.out.println();
        */
        long maxCal=Long.MIN_VALUE;
        for(int i=0;i<=N;i++){
            for(int j=0;j<=N-i;j++){
                //System.out.println("(i,j)=("+i+","+j+")");
                long oa=i==0?0:OA[i-1];
                long ob=j==0?0:OB[j-1];
                long lengthOA=i==0?0:places[i-1];
                long lengthOB=j==0?0:placesRev[j-1];
                long temp=oa+ob-Math.min(lengthOA*2+lengthOB,lengthOA+lengthOB*2);
                if(maxCal<temp){
                    maxCal=temp;
                }
               // System.out.println("maxCal="+maxCal);
            }
        }
        System.out.println(maxCal);

    }
}
