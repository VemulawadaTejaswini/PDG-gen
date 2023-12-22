import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int[] era = new int[100000001];
        for(int i = 2; i <= 100000000; i++){
            if(era[i] == 0){
                era[i] = 1;
                if(i <= 10000){
                    int j = 2*i;
                    while(j <= 100000000){
                        if(era[j] == 0){
                            era[j] = -1;
                        }
                        j += i;
                    }
                }
            }
        }
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
    	int cnt = 0;
        for(int i = 0; i < n; i++){
            int x = scan.nextInt();
            if(era[x] > 0){
                cnt++;
            }
        }
    	System.out.println(cnt);
    }
}
