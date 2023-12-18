import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        long n1 = sc.nextInt();
        long n2 = sc.nextInt();
        double[] nums = new double[(int)n1];
        for(int i=0; i<n1; i++){
            long num = sc.nextInt();
            long um = 0;
            for(long u=0; u<num; u++){
                um += u+1;
            }
            nums[i] = (double)um/num;
        }
        
        int N = (int)(n1-n2+1);
        double[] anss = new double[N];
        for(int j=0; j<N; j++){
            for(int k=0; k<n2; k++){
                anss[j] += nums[k+j];
            }
        }
        double max = 0;
        for(double dob: anss){
            if(dob>max){
                max = dob;
            }
        }
        System.out.println(max);
    }
}
