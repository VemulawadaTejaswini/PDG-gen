import java.util.Scanner;
 
class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S[] = new String[N];       
        int ans = 1;

        for(int i=0;i<N;i++) {
        	S[i] = sc.next();
        }
        
        for(int i=1;i<N;i++) {
        	
        	int check = 0;
            for(int j=0;j<i;j++) {
            	if(S[i].equals(S[j])) check ++;
            	if(check != 0) break;
            }
            if(check == 0) ans++;
        }
        
        System.out.print(ans);
        

	}
}