import java.util.Scanner;
public class Main{
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            int n = scan.nextInt();
            if(n == 0){
                break;
            }
            int[] a = new int[n];
            for(int i = 0;i < n;i++){
                a[i] = scan.nextInt();
            }
            int max = a[0];
            int res = a[0];
            for(int i = 1;i < n;i++){
            	max = maximum(a[i],a[i]+max);
            	res = maximum(res,max);
            }
            System.out.println(res);
        }
    }
    public static int maximum(int a,int b){
        return (a > b)?a:b;
    }
}