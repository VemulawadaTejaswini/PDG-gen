import java.util.Scanner;
public class Main {
	static Scanner sc=new Scanner(System.in);
	static int N=sc.nextInt();
	static int flower[]=new int[N];
public static void main(String[] args) {
	int ans=0;
	int left=0;
	int right=0;
	int left_exist=0;
	for(int i=0;i<flower.length;i++) {
		flower[i]=sc.nextInt();
	}
	ans+=counter(0, flower.length-1, flower);
	while(true) {
		int checkNum=0;
	for(int i=0;i<flower.length;i++) {
		if(flower[i]!=0 && left_exist==0) {
			left=i;
			left_exist=1;
			checkNum++;
		}
		if(flower[i]==0&&left_exist==1) {
			right=i-1;
			ans+=counter(left, right, flower);
			left_exist=0;
		}}
		if(checkNum==0) {
			System.out.println(ans);
			System.exit(0);
	}
	}
	}
public static int counter(int left,int right,int flower[]) {
	int min=0;
	for(int i=left;i<=right;i++) {
		if(i==left) {
			min=flower[left];
		}else {
			if(min>flower[i]) {
				min=flower[i];
			}
		}
	}
	for(int i=left;i<=right;i++) {
		flower[i]-=min;
	}
	return min;
}
}