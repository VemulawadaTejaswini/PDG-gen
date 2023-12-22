import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] v = new int[16384];
        for(int i = 0;i < 16384;i++){
            v[i] = 1;
        }
        int p = 3;
        while(true){
            if(p*p > 32768){
                break;
            }else{
                if(v[(p-1)/2] == 0){
                    p += 2;
                }else{
                    int t = p*p;
                    while(t < 32768){
                        v[(t-1)/2] = 0;
                        t += 2*p;
                    }
                    p += 2;
                }
            }
        }
        while(scan.hasNext()){
            int n = scan.nextInt();
            if(n == 0){
                break;
            }else if(n == 4){
                System.out.println(1);
                continue;
            }else if(n%2 != 0){
                if(v[(n-3)/2] == 1){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
                continue;
            }
            int count = 0;
            for(int i = 1;i <= (n/2-1)/2;i++){
                if(v[i] == 1 && v[n/2-i-1] == 1){
                    count++;
                }
            }
            System.out.println(count);
        }
	}
}