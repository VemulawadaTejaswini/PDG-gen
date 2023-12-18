import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int[] moster = new int[N+1];
		int[] yusha = new int[N];
		for(int i=0;i<N+1;i++) {
			moster[i] = sc.nextInt();
		}
		for(int i=0;i<N;i++) {
			yusha[i] = sc.nextInt();
		}
		int buffSum=0;
		int sum=0;

		for(int i=N;i>=1;i--) {
			if(i==N) {
				if(moster[i] + moster[i-1]-yusha[i-1] >= 0) {
					if(yusha[i-1]>=yusha[i-2]) {
						sum += yusha[i-1];
						buffSum = moster[i] + moster[i-1]-yusha[i-1];
					}else {
						sum += moster[i];
						buffSum =yusha[i-1]-moster[i];
					}
				}else {
					sum += moster[i] + moster[i-1];
					buffSum=0;
				}
			}else {
				if(buffSum + moster[i-1]-yusha[i-1] >= 0) {
					if(yusha[i-1]>=yusha[i-2]){
						sum += yusha[i-1];
						buffSum = moster[i] + moster[i-1]-yusha[i-1];
					}else {
						sum += moster[i];
						buffSum =yusha[i-1]-moster[i];
					}
				}else {
					sum += moster[i] + moster[i-1];
					buffSum=0;
				}
			}
		}
		System.out.println(sum);
	}
}
