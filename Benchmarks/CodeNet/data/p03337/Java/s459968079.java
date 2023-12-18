import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		//input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		int sumw = 0, min = n, tmpw = 0, sume = 0, tmpe = 0;
		for(int i=0; i<n; i++){
			if(s.charAt(i)=='W'){
				sumw++;
			}
		}
		sume = n - sumw;

		//method
		for(int i=0; i<n; i++){
			tmpe = sume - (i - tmpw);
			if(tmpw+tmpe<min){
				min = tmpw+tmpe;
			}
			if(s.charAt(i)=='W'){
				tmpw++;
			}
		}
		System.out.println(min);
	}
}