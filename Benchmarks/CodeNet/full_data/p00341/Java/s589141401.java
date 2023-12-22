import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] array = new int[12];
		int j, c = 0, f = 0;
		int tmp1, tmp2, tmp3;
		for(int i = 0;i < 12;++i){
			f = 0;
			tmp1 = -1;
			tmp2 = -1;
			tmp3 = -1;
			array[i] = sc.nextInt();
			for(j = 0;j < i;++j){
				if(array[j] == array[i]){
					++f;
					if(tmp1 != -1){
						if(tmp2 != -1){
							tmp3 = j;
						}else{
							tmp2 = j;
						}
					}else{
						tmp1 = j;
					}
				}
			}
			if(f >= 3){
				++c;
				array[tmp1] = -1;
				array[tmp2] = -1;
				array[tmp3] = -1;
				array[i] = -1;
			}
		}
		System.out.println(c >= 3 ? "yes" : "no");
	}
}