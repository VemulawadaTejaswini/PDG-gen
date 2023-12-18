import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] mm = new long[n];
        // int[] pp = new int[n];
        // pp[0] = sc.nextInt();
        // for(int i=1; i<n; i++){
        //     pp[i] = pp[i-1] + sc.nextInt();
        // }
        // for(int i=0; i<n; i++){
        //     System.out.print(pp[i] + " ");
        // }
        // int sum = pp[n-1]/2;

        for(int i=0; i<n; i++){
            mm[i] = sc.nextLong();
        }
        int i=0;
        int j=n-1;
        long sum1 = mm[i];
        long sum2 = mm[j];
        i++;
        j--;
        for(;i<=j;){
            // System.out.println(mm[i]);
            if(sum1 < sum2){
                sum1 += mm[i];
                i++;
            }else if(sum2 < sum1){
                sum2 += mm[j];
                j--;
            }else{
                sum1 += mm[i];
                sum2 += mm[j];
                i++;
                j--;
            }
        }
        System.out.println((long)Math.abs(sum1-sum2));
        // System.out.println(pp[n-1]/2+" "+pp[(n-1)/2]);
        sc.close();
    }
}