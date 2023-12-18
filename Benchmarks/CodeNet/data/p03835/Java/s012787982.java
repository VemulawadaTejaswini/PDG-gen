import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int K=sc.nextInt();
		int S=sc.nextInt();
		int count=0,sum=0;
		int x,y,z;
		for(int i=0;i<K+1;i++){
			for(int j=0;j<K+1;j++){
				for(int k=0;k<K+1;k++){
					sum=i+j+k;
					if(sum==S)count++;
				}
			}
		}
		System.out.println(count);
	}

}
