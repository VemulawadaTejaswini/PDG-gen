import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
        long res = 1;
        long seven = 7; 
        if(K%2==0){
            System.out.println("-1");
            return;
        }else{
            while(seven%K!=0){
                res++;
                seven = seven*10+7;
            }
            System.out.println(res);

        }
		
	}
}