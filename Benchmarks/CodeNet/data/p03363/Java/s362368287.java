
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	// write your code here
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        int[] ints=new int[N];
        String line=scanner.nextLine();
        line=scanner.nextLine();
        String[] strings=line.split(" ");
        for(int i=0;i<N;i++){
            ints[i]=Integer.parseInt(strings[i]);
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
