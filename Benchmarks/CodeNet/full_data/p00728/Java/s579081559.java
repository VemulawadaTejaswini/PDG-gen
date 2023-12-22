import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),i,sum=0,max=0,min=1000;
        while(true){
            int[] s = new int[n];
            for(i=0;i<n;i++) {
                s[i] = sc.nextInt();
                sum += s[i];
                if(s[i]>max) max = s[i];
                if(s[i]<min) min = s[i];
            }
            System.out.println((sum-max-min)/(n-2));
            sum = 0;
            max = 0;
            min = 1000;
            n = sc.nextInt();
            if(n==0) break;
        }
    }
}
