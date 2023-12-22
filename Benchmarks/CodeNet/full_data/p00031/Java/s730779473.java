import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	void doIt() {
		while(true){
			try{
				int n = sc.nextInt();
				String num =  Integer.toBinaryString(n);
				char ctr[] = num.toCharArray();
				int cnt = 1;
				int ans = 0;
				for(int i = ctr.length - 1;i >= 0;i--){
					if(ans == 0){
						if(Integer.parseInt(""+ctr[i]) == 1){
							System.out.print(cnt);
							ans++;
						}
					}else{
						if(Integer.parseInt(""+ctr[i]) == 1){
							System.out.print(" "+cnt);
						}
					}
					cnt *= 2;
				}
				System.out.println();
			}catch(Exception g){
				System.exit(0);
			}
		}
	}
    public static void main(String[] args) {
    	new Main().doIt();
    }
}