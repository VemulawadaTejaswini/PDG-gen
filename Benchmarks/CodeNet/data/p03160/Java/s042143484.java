import java.util.Scanner;

public class Frog1 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int N= sc.nextInt();
        int cur=N-1;
        int[] arr= new int[N];
        for (int x=0; x<N; x++){
            arr[x]= sc.nextInt();
        }
        int total=0;
        while (cur>=2){
            int temp=arr[cur];
            int first= arr[cur-1];
            int second= arr[cur-2];
            if (Math.abs(first-temp) >= Math.abs(second-temp)){
                total+= Math.abs(second-temp);
                cur-=2;
            }
            else{
                total+= Math.abs(first-temp);
                cur-=1;
            }
        }
        System.out.println(total);
    }
}
