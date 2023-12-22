import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] v = new int[500000];
        for(int i = 0;i < 500000;i++){
            v[i] = 1;
        }
        int p = 3;
        while(true){
            if(p*p > 1000000){
                break;
            }else{
                if(v[(p-1)/2] == 0){
                    p += 2;
                }else{
                    int t = p*p;
                    while(t < 1000000){
                        v[(t-1)/2] = 0;
                        t += 2*p;
                    }
                    p += 2;
                }
            }
        }
        v[0] = 0;
		while(scan.hasNext()){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			int count = 0;
			for(int i = 1;i < n/2;i++){
				if(v[i] != 1){
					continue;
				}
				if(v[(n-2*i-2)/2] == 1){
					count += ((n-2*i-2)/2 == i)?2:1;
				}
			}
			System.out.println(count/2);
        }
	}
}