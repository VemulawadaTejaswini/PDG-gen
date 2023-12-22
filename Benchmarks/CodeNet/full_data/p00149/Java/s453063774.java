import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int [][]eye=new int[4][2];
		while(sc.hasNext()){
			for(int i=0;i<2;i++){
				double p=sc.nextDouble();
				if(p<2.0)eye[3][i]++;
				else if(p<6.0)eye[2][i]++;
				else if(p<1.1)eye[1][i]++;
				else eye[0][i]++;
			}
		}
		for(int i=0;i<4;i++){
			System.out.println(eye[i][0]+" "+eye[i][1]);
		}
	}
}