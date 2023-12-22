import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.next());
        long[] ary = new long[100];
        for(int i=0; i<n; i++){
            ary[i] = Long.parseLong(sc.next());
        }
        int count = 0;
        for(int i=0; i<n-2; i++){
            for(int j=i+1; j<n-1; j++){
                if(ary[i] != ary[j]){
                    for(int k=j+1; k<n; k++){
                        if(ary[i] !=  ary[k] && ary[j] != ary[k]){
                            long max = Math.max(ary[i], Math.max(ary[j], ary[k]));
                            long min = Math.min(ary[i], Math.min(ary[j], ary[k]));
                            long mid = ary[i] + ary[j] + ary[k] - max - min;
                            if(min + mid > max){
                                count++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}