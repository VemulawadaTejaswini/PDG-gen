import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(),sum=0;
        double ave,tmpsum=0;
        while(n!=0){
            int [] s = new int[n];
            for(int i=0;i<n;i++) {
                s[i] = sc.nextInt();
                sum += s[i];
            }
            ave = (double)sum/n;
            for(int i=0;i<n;i++) tmpsum += (s[i]-ave)*(s[i]-ave);
            ave = tmpsum/n;
            System.out.println(Math.sqrt(ave));
            sum = 0;
            tmpsum = 0;
            n = sc.nextInt();
        }
    }
}
