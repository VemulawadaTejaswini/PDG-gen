import java.util.Scanner;
public class Main6 {
    static int N,K;
    static int[] arrInput;
    static int dis = Integer.MAX_VALUE;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		K = sc.nextInt();
		arrInput = new int[N];
		int insertIndex=0;
		for(int i=0;i<N;i++){
			arrInput[i] = sc.nextInt();
			if(0>arrInput[i]){
				insertIndex++;
			}
		}
		int minIndex = -1;
		int maxIndex = -1;
		if(insertIndex-K<0 && insertIndex+K>N-1){
			minIndex = 0;
			maxIndex = N-1;
		}
		if(insertIndex-K<0 && insertIndex+K<=N-1){
			minIndex = 0;
			maxIndex = insertIndex +K;
		}
		if(insertIndex-K>=0 && insertIndex+K>N-1){
			minIndex = insertIndex-K;
			maxIndex = N-1;
		}
		if(insertIndex-K>=0 && insertIndex+K<=N-1){
			minIndex = insertIndex-K;
			maxIndex = insertIndex+K;
		}
		
		int minVal = Math.abs(0-arrInput[0]);
		int maxVal =  Math.abs(0-arrInput[0]);
		for(int i=minIndex;i<=maxIndex;i++){
			if(Math.abs(0-arrInput[i])<minVal){
				minVal = Math.abs(arrInput[i]);
			}
			if(Math.abs(0-arrInput[i])>maxVal){
				maxVal = arrInput[i];
			}
		}
		System.out.println("minVal: "+minVal + " maxVal: "+maxVal);
		dis= maxVal-minVal;
		System.out.println(dis);
	}
}