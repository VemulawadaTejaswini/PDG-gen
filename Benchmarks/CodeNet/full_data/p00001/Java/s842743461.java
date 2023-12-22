import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		int M[] = new int[10];
		for(int a = 0;a<10;a++){
			M[a] = scan.nextInt();
		}
		int No1 = M[0];
		int No2 = M[1];
		int No3 = M[2];
		if(No1 < No2){
			No1 = M[1];
			No2 = M[0];
		}
		if(No1 < No3){
			No3 = No2;
			No2 = No1;
			No1 = M[2];
		}else if(No2 < No3){
			No3 = No2;
			No2 = M[2];
		}
		for(int b = 3;b<10;b++){
			if(No1 < M[b]){
				No3 = No2;
				No2 = No1;
				No1 = M[b];
			}else if(No2 < M[b]){
				No3 = No2;
				No2 = M[b];
			}else if(No3 < M[b]){
				No3 = M[b];
			}
		}
		System.out.println(No1 + "\n" + No2 + "\n" + No3);
	}
}