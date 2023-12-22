import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] v = new int[5000000];
        for(int i = 0;i < 5000000;i++){
            v[i] = 1;
        }
        int p = 3;
        while(true){
            if(p*p > 10000000){
                break;
            }else{
                if(v[(p-1)/2] == 0){
                    p += 2;
                }else{
                    int t = p*p;
                    while(t < 10000000){
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
			}
			int t = (n % 2 == 0)?n/2-1:n/2;
			for(int i = t;i > 0;i--){
				if(v[i] == 1){
					if(v[i-1] == 1 && v[i-3] == 1 && v[i-4] == 1){
						System.out.println(2*i+1);
						break;
					}
				}
			}
		}
	}
}