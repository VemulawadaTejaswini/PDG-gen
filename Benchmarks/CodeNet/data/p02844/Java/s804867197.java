import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] S = sc.next().toCharArray();
        int result = 0;
        for(int i=0; i<1000; i++){
            int[] a = {i/100, (i/10)%10, i%10};
            int count = 0;
            for(int m=0; m<N; m++){
                if(S[m]==a[count]){
                    count++;
                }
                if(count==3){
                    break;
                }
            }
            if(count==3){
                result++;
            }
        }
		System.out.println(result);
	}
}