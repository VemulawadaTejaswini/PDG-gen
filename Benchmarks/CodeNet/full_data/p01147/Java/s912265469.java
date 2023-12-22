import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final int N = sc.nextInt();

			if (N == 0) {
				break;
			}

			String[] array = new String[N];
			for (int i = 0; i < N; i++) {
				array[i] = sc.next();
			}

			Arrays.sort(array);

			for (int count = 0; count < N - 1; count++) {
				int cur_num = -1;
				int con_num = -1;
				int rest = -1;
				boolean order = true;
				
				for (int i = 0; i < N; i++) {
					if("".equals(array[i])){
						continue;
					}
					
					char[] moto = array[i].toCharArray();

					for (int j = i + 1; j < N; j++) {
						if ("".equals(array[j])) {
							continue;
						}

						char[] con = array[j].toCharArray();

						final int len = Math.min(moto.length, con.length);

						//
						{
							int ll = -1;
							LOOP: for (int l = 0; l < len; l++) {
								for (int c = l; c >= 0; c--) {
									if (moto[moto.length - 1 - c] != con[l - c]) {
										continue LOOP;
									}
								}

								ll = l;
							}

							if (rest < ll) {
								order = true;
								cur_num = i;
								con_num = j;
								rest = ll;
							}
						}

						//
						{
							int ll = -1;
							LOOP: for (int l = 0; l < len; l++) {
								for (int c = l; c >= 0; c--) {
									if (con[con.length - 1 - c] != moto[l - c]) {
										continue LOOP;
									}
								}

								ll = l;
							}

							if (rest < ll) {
								order = false;
								cur_num = i;
								con_num = j;
								rest = ll;
							}
						}
					}
				}
				
				/*System.out.println(array[cur_num] + " " + array[con_num] + " "
						+ rest + " " + order);*/
				rest++;
				
				try{
				if (order) {
					array[cur_num] = array[cur_num].substring(0,
							array[cur_num].length() - rest)
							.concat(array[con_num]);
				} else {
					array[cur_num] = array[con_num].substring(0,
							array[con_num].length() - rest)
							.concat(array[cur_num]);
				}
				}catch(Exception e){
					System.err.println(array[cur_num] + " " + array[con_num] + " "
							+ rest + " " + order);
				}
				
				array[con_num] = "";
				Arrays.sort(array);
			}

			for(String str : array){
				if(!"".equals(str)){
					System.out.println(str);
					break;
				}
			}
		}

		sc.close();
	}

}