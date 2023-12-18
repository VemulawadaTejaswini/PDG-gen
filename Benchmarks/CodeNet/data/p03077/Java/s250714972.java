import java.util.Scanner;

public class Main {
	static String ans="Yay!";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Map<Long,Integer>map=new HashMap<>();
		long n=sc.nextLong();
		long a[]=new long[5];
		for(int i=0;i<5;i++) {
			a[i]=sc.nextLong();
		}
		long count=0;
		for(int i=0;i<5;i++) {
			if(n/a[i]>0 && n!=a[i]) { //	始めて移送能力を超えた時
				count+=n/a[i];
				if(n%a[i]==0)count--;
				for(int j=i;j<4;j++) {
					if(a[j]/a[j+1]>0&& a[j]!=a[j+1]) {
						count+=a[j]/a[j+1];
						if(a[j]%a[j+1]==0)count--;
					}else {
						a[j+1]=a[j];
					}
				}
			break;
			}
		}
		System.out.println(5+count);
	}
}
