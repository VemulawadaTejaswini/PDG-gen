import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int ct = sc.nextInt();


		if(ct != 0){
			int[] array = new int[ct];
			for(int i = 0; i < ct; i++){
				array[i] = sc.nextInt();
			}
			array = sort(x , ct, array);
			check(x,ct,array);

		}else{
			System.out.println(x);
		}
	}

	public static int[] sort(int x, int ct, int[] array){
		for(int i = 0; i < ct; i++){
			for(int j = i; j < ct; j++){
				if(array[i] > array[j]){
					int tmp = array[i];
					array[i] = array[j];
					array[j] = tmp;
				}
			}
		}
		return array;
	}

	public static void check(int x, int ct, int[] array ){
		boolean flg = true;
		for(int i = 0; i < ct; i++){
			if(array[i] == x){
				int tmp = 1;
				int up = 1;
				int down = 1;
				int ch = 0;
				while(flg){
					if(i + up < ct){
						if(x + tmp < array[i + up]){
							ch = x + tmp;
							flg = false;
						}else if((x + tmp) == array[i + up]){
							up ++ ;
						}
					}else{
						ch = x + tmp + 1;
						flg = false;
					}
					if(i - down >= 0){
						if(x - tmp > array[i - down]){
							ch = x - tmp;
							flg = false;
						}else if((x - tmp) == array[i - down]){
							down ++;

						}					
					}else{
						ch = x - tmp -1;
						flg = false;
					}



					tmp ++;
				}
				System.out.println(ch);
			}

		}
		if(flg){
			System.out.println(x);
		}
	}
}