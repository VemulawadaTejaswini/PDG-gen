import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int[] v = new int[5000];
	    for(int i = 0;i < 5000;i++){
	    	v[i] = 1;
	    }
	    int p = 3;
	    while(true){
	        if(p*p > 10000){
	            break;
	        }else{
	            if(v[(p-1)/2] == 0){
	                p += 2;
	            }else{
	                int t = p*p;
	                while(t < 10000){
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
			if(n == 1 || n == 2){
				System.out.println(0);
				continue;
			}else if(n == 3){
				System.out.println(1);
				continue;
			}else if(n == 4){
				System.out.println(2);
				continue;
			}
			int m = n+1;
			int count = 0;
			if((m-2)%2 != 0){
				if(v[(m-3)/2] == 1){
					count+=2;
				}
			}
			for(int i = 3;i <= (n+1)/2;i+=2){
				if((m-i)%2 == 0 || v[(i-1)/2] != 1){
					continue;
				}
				if(v[(m-i-1)/2] == 1){
					count += (i == m-i)?1:2;
				}
			}
			System.out.println(count);
		}
	}
}