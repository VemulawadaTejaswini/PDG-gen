import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int[] ans = new int[1000];
        int[] data =new int[100];
        int min,max;
        min=1000;
        max=0;
        int sum=0;
        int k=0;
        int n=100;
        while(n!=0){
            n=sc.nextInt();
            for(int i=0;i<n;i++){
                data[i]=sc.nextInt();
                if(data[i]<min)min=data[i];
                if(data[i]>max)max=data[i];
                sum = sum+data[i];
            }
            sum=sum-max-min;
            ans[k]=sum/(n-2);
            sum=0;
            min = 1000;
            max=0;
            k++;
            
        }
        for(int i=0;i<k-1;i++){
            System.out.println(ans[i]);
        }
    }
}
