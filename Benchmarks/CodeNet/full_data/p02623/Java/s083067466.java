import java.util.Scanner;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long[] line = Stream.of(sc.nextLine().split(" ", 0)).mapToLong(Long::parseLong).toArray();
		long[] desk_a = Stream.of(sc.nextLine().split(" ", 0)).mapToLong(Long::parseLong).toArray();
		long[] desk_b = Stream.of(sc.nextLine().split(" ", 0)).mapToLong(Long::parseLong).toArray();
		int ind_a = 0;
		int ind_b = 0;
		long time = 0;
		long con = 0;
		boolean isDeskABlank = false;
		boolean isDeskBBlank = false;

		while (true) {
			if (isDeskABlank == false && isDeskBBlank == false) {
				if (desk_a[ind_a] < desk_b[ind_b]) {
					time += desk_a[ind_a];
					ind_a++;
				} else if (desk_a[ind_a] > desk_b[ind_b]){
					time += desk_b[ind_b];
					ind_b++;
				} else if (desk_a[ind_a] == desk_b[ind_b]) {
					if (desk_a[ind_a + 1] <= desk_b[ind_b + 1]) {
						time += desk_a[ind_a];
						ind_a++;
					} else if (desk_a[ind_a + 1] > desk_b[ind_b] + 1){
						time += desk_b[ind_b];
						ind_b++;
					}
				}

			} else if(isDeskABlank == true && isDeskBBlank == false) {
				time += desk_b[ind_b];
				ind_b++;
			} else if(isDeskABlank == false && isDeskBBlank == true) {
				time += desk_a[ind_a];
				ind_a++;
			}else if (isDeskABlank == true && isDeskBBlank == true) {
				break;
			}

			if (time > line[2]) {
				break;
			}else {
				con++;
			}

			if (ind_a == line[0]) {
				isDeskABlank = true;
			}

			if (ind_b ==line[1]) {
				isDeskBBlank = true;
			}

		}

		System.out.println(con);

	}
}
