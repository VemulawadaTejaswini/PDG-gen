import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	long ans1=0;
    	long ans2=0;
		long X = sc.nextLong();
		loop:for(long i=-1000;i<=1000;i++){
			for(long k=-1000;k<=1000;k++){
				if (X==(i-k)*((i*i*i*i)+(i*i*i)*k+(i*i)*(k*k)+i*(k*k*k)+(k*k*k*k))){
							ans1=i;
							ans2=k;
							System.out.print(ans1);
							System.out.print(" ");
							System.out.print(ans2);
							break loop;
				}
				}
			}
		}
    }