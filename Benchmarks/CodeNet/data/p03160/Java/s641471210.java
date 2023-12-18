import java.util.Scanner;

public class A {
    public  static  void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int h []=new int[n];
        for(int j=0;j<n;j++)
            h[j]=sc.nextInt();
        int cost[]= new int [n];
        cost[0]=0;
        cost[1]=Math.abs(h[1]-h[0]);
        for (int i=2;i<n;i++){
            cost[i]=Math.min(cost[i-1]+Math.abs(h[i]-h[i-1]),cost[i-2]+Math.abs(h[i]-h[i-2]));
        }
        System.out.println(cost[n-1]);
    }
}
