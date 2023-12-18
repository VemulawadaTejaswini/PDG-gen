import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] mm = new int[n];
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
            mm[i] = sc.nextInt();
        }
        int i=0;
        int j=n-1;
        int sum1 = mm[i];
        int sum2 = mm[j];
        for(;i+1<j;){
            // System.out.println(mm[i]);
            if(sum1 < sum2){
                i++;
                sum1 += mm[i];
            }else if(sum2 < sum1){
                j--;
                sum2 += mm[j];
            }else{
                i++;
                j--;
            }
        }
        System.out.println((int)Math.abs(sum1-sum2));
        // System.out.println(pp[n-1]/2+" "+pp[(n-1)/2]);
        sc.close();
    }
}