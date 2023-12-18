import java.util.*;

class Main {
    int N, M;
    int[] A;

    public Main(){
        Scanner SC = new Scanner(System.in);
        N = SC.nextInt();
        M = SC.nextInt();
        A = new int[N];

        for(int i=0;i<N;i++){
            A[i] = SC.nextInt() / 2;
        }

        int valueLCM = valueLCM = LCM(A[0], A[1]);
        for(int i=1;i<N-1;i++){
            valueLCM = LCM(valueLCM, A[i+1]);
        }

        int L=-1, R=(M+1)/2;
        while(R-L > 1){
            int mid = L+(R-L)/2;

            if(valueLCM * (2*mid+1) > M)
                R = mid;
            else
                L = mid;
        }

        System.out.println(R);
    }

    int LCM(int val1, int val2){
        int maxValue = Math.max(val1, val2);
        int minValue = Math.min(val1, val2);

        if(minValue == 0) return maxValue;

        long val3 = maxValue * minValue;

        int temp = maxValue%minValue;
        while( temp != 0 ){
            maxValue = minValue;
            minValue = temp;
            temp=maxValue%minValue;
        }

        return (int)(val3/minValue);
    }

    public static void main(String[] args){
        Main m = new Main();
    }
}
