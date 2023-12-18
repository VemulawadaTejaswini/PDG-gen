import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int flg = 0;
        int n = sc.nextInt();  
        int a[] = new int[n];  
        for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
        }
        boolean sw = true;
        while(sw == true){
	    for(int i = 0; i < n; i++){
			if(a[i]%2==0) {
			flg++;
			a[i] = a[i] / 2;
			}
			}
			if(flg==n){
				count++;
				flg = 0;
			} 
			else
			{
			sw = false;
			break;
			}
		}
        System.out.println(count);
    }
}