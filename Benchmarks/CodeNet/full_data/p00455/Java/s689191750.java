import java.util.Scanner;
public class Main{
	public static void getdata(int[] data){
		Scanner scan = new Scanner(System.in);
		for(int i = 0 ; i < 6 ; i ++){
			data[i]=scan.nextInt();
		}
	}
	public static void print(int[] data){
		int h = data[3]-data[0];
		int m = data[4]-data[1];
		int s = data[5]-data[2];
		if(s < 0){
			m = m - 1;
			s = 60 + s;
		}
		if(m < 0){
			h = h - 1;
			m = 60 + m;
		}
        data[0] = (data[0]*60+data[1])*60+data[2];
        data[1] = (data[3]*60+data[4])*60+data[5];
        data[0] = data[1]-data[0];
		System.out.println(data[0]/3600+" "+data[0]/60%60+" "+data[0]%60);
	}
	public static void main(String[] args) {
		int[] A = new int[6];
		int[] B = new int[6];
		int[] C = new int[6];
		
		getdata(A);
		getdata(B);
		getdata(C);
		
		print(A);
		print(B);
		print(C);
	}
}