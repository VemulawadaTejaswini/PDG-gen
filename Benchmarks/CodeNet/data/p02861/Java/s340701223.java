
import java.util.Scanner;

 class Main {


    static double sum;

    private static void recFunc(int[][] a,boolean[] included, int index, int count, double currSum){
        if(count>=a.length){
            sum+=currSum;
            return;
        }

        for(int i=0;i<a.length;i++){
            if(!included[i]){
                included[i]=true;
                if(count==0){
                    recFunc(a, included, i, count+1, currSum);
                }else{
                    double dist = Math.sqrt((Math.pow((a[index][0]-a[i][0]) ,2) + Math.pow((a[index][1]-a[i][1]), 2)));
                    recFunc(a, included, i, count+1, currSum+dist);
                }
                included[i]=false;
            }
        }
    }

    private static  int factorial(int n){
        int a=1;
        for(int i=1;i<=n;i++)
            a=a*i;
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[][] a=new int[n][2];
        boolean[] included= new boolean[n];
        sum=0;
        for(int i=0;i<n;i++){
            a[i][0]=in.nextInt();
            a[i][1]=in.nextInt();
        }
        recFunc(a, included, 0, 0, 0.0);
        int fact=factorial(n);
        //System.out.println(sum + " " + fact);
        double ans=sum/fact;
        System.out.println(ans);

    }
}
