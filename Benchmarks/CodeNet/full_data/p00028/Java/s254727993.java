import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws java.io.IOException {
		Scanner scan = new Scanner(System.in);
		int a[] = new int[9];
		while(scan.hasNext()){
			int t = scan.nextInt();
			if(String.valueOf(t) == null){
				break;
			}
			if(t == 1){
				++a[0];
			}else if(t == 2){
				++a[1];
			}else if(t == 3){
				++a[2];
			}else if(t == 4){
				++a[3];
			}else if(t == 5){
				++a[4];
			}else if(t == 6){
				++a[5];
			}else if(t == 7){
				++a[6];
			}else if(t == 8){
				++a[7];
			}else{
				++a[8];
			}
			System.out.println(a[4]);
		}
		int mux = a[0];
		for(int i = 1 ; i < 9 ; i++){
			if(mux < a[i]){
				mux = a[i];
			}
		}
		for(int i = 0; i<9 ; i++){
			if(a[i] == mux){
				System.out.println(i+1);
			}
		}
	}
}