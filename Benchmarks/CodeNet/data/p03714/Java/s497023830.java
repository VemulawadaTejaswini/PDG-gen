import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
        int i;
        int j;

        int arr[] = new int [3*N];

        for (i=0; i<3*N; i++){
            arr[i]=sc.nextInt();
        }

        int beforemax[] = new int[N];
        int aftermax[] = new int[N];

        beforemax=Arrays.copyOfRange(arr, 0, N);

        Arrays.sort(beforemax);

        int beforesum[] = new int[N+1];


        aftermax=Arrays.copyOfRange(arr, 2*N, 3*N);

        Arrays.sort(aftermax);

        int aftersum[] = new int[N+1];

        beforesum[0]=intsum(beforemax);
        aftersum[N]=intsum(aftermax);


        for(i=N; i<2*N; i++){
            if(arr[i]>beforemax[0]){
                beforemax[0]=arr[i];
                Arrays.sort(beforemax);
            }
            beforesum[i-N+1]=intsum(beforemax);
        }

        for(i=2*N-1; i>N-1; i--){
            if(arr[i]<aftermax[N-1]){
                aftermax[N-1]=arr[i];
                Arrays.sort(aftermax);
            }
            aftersum[i-N]=intsum(aftermax);
        }

        long submax = -1000000;

        for(i=0; i<N+1; i++){
            if(beforesum[i]-aftersum[i]>submax){
                submax=beforesum[i]-aftersum[i];
            }
        }



		// 文字列の入力
		//String s = sc.next();
		// 出力
		System.out.println(submax);
	}


    public static int intsum(int[] x){
        int t = 0;
        for (int a:x){
            t += a;
        }
        return t;
    }
    public static long longsum(long[] x){
        long t = 0;
        for (long a:x){
            t += a;
        }
        return t;
    }
}

