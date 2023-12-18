
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int[] ints=new int[N];
        for(int i=0;i<N;i++){
            ints[i]= scanner.nextInt();
        }
        int result=0;
        for(int i=0;i<N;i++){
            int sum=0;
            for(int j=i;j<N;j++){
                sum+=ints[j];
                if(sum==0){
                    result++;
                }
            }
        }
        System.out.println(result);

    }
}
