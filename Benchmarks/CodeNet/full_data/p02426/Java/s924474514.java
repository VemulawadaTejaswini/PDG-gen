import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		int q, mask_num, order_num, i, j = 0, n = 0, counter;
		boolean[] flag = new boolean[64];
		List<List<Integer>> mask = new ArrayList<>();
		try (Scanner sc = new Scanner(System.in)) {
			q = sc.nextInt();
			for(i = 0; i < q; i++) {
				mask.add(new ArrayList<Integer>());
			}
			for(i = 0; i < q; i++) {
				mask_num = sc.nextInt();
				for(j = 0; j < mask_num; j++) {
					mask.get(i).add(sc.nextInt());
				}
			}
			q = sc.nextInt();
			for(j = 0; j < q; j++) {
				order_num = sc.nextInt();
				n = sc.nextInt();
				List<Integer> array = mask.get(n);
				switch(order_num) {
				case 0 : System.out.println(flag[n] ? "1" : "0"); break;
				case 1 : 
					for(i = 0; i < array.size(); i++) {
						flag[array.get(i)] = true;
					}; break;
				case 2 : 
					for(i = 0; i < array.size(); i++) {
						flag[array.get(i)] = false;
					}; break;
				case 3 : 
					for(i = 0; i < array.size(); i++) {
						flag[array.get(i)] = !flag[array.get(i)];
					}; break;
				case 4 :
					counter = 1;
					for(i = 0; i < array.size(); i++) {
						if(flag[array.get(i)] != true) {
							counter = 0;
							break;
						}
					}
					System.out.println(counter); break;
				case 5 :
					counter = 0;
					for(i = 0; i < array.size(); i++) {
						if(flag[array.get(i)] != false) {
							counter = 1;
							break;
						}
					}
					System.out.println(counter); break;
				case 6 :
					counter = 1;
					for(i = 0; i < array.size(); i++) {
						if(flag[array.get(i)] == true) {
							counter = 0;
							break;
						}
					}
					System.out.println(counter); break;
				case 7 :
					counter = 0;
					for(i = 0; i < array.size(); i++) {
						if(flag[array.get(i)] == true) {
							counter++;
						}
					}
					System.out.println(counter); break;
				case 8 :
					BigDecimal sum = new BigDecimal("0");
					BigDecimal big = new BigDecimal("2");
					for(i = 0; i < array.size(); i++) {
						if(flag[array.get(i)] == true) {
							sum = sum.add(big.pow(array.get(i)));
						}
					}
					System.out.println(sum);
				}
			}
		}
	}
}
