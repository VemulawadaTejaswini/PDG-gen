import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] pasta = new int [3];
		int [] jyusu = new int [2];
		for(int i = 0; i < pasta.length; i++) {
			pasta[i] = sc.nextInt();
		}
		for(int i = 0; i < jyusu.length; i++) {
			jyusu[i] = sc.nextInt();
		}
		int low = pasta[0] + jyusu[0];
		for(int i = 0; i < pasta.length; i++) {
			for(int j = 0; j < jyusu.length; j++) {
				if (low > pasta[i] + jyusu[j]){
					low = pasta[i] + jyusu[j];
				}
			}
		}
		System.out.println(low-50);
	}

}