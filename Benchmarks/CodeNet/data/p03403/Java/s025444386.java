import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int[] a = new int[n+2];
        for(int i=0;i<n;++i)a[i+1]=scan.nextInt();
        a[0]=0;
        a[n+1]=0;

        int sum = 0;
        for(int i=1;i<n+2;++i)sum += Math.abs(a[i] - a[i-1]);
        for(int i=1;i<n+1;++i){
            //iをやめたとき
            if((a[i]-a[i-1])*(a[i+1]-a[i])>=0){
                System.out.println(sum);
            }else{
                if(Math.abs(a[i]-a[i-1])<Math.abs(a[i]-a[i+1]))System.out.println(sum - Math.abs(a[i-1]-a[i])*2);
                else System.out.println(sum - Math.abs(a[i+1]-a[i])*2);
            }
        }




    }
}