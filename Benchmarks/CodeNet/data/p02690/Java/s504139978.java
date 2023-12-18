import java.util.*;
public class Main {
	public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int ans1=0;
    	int ans2=0;
    	
		long X = sc.nextLong();
		loop:for(int i=-1000;i<=1000;i++){
			for(int k=-1000;k<=1000;k++){
				if (X==(i-k)*((i*i*i*i)+(i*i*i)*k+(i*i)*(k*k)+i*(k*k*k)+(k*k*k*k))){
							ans1=i;
							ans2=k;
							System.out.println(ans1);
							System.out.println(ans2);
							break loop;
				}
				}
			}
		}
    }