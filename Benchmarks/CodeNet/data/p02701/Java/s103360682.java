import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);

				int Kuji = sc.nextInt();
				List<String> gift = new ArrayList<String>();
			for(int i = 1; i <= Kuji; i++) {
				String syohin = sc.next();
				if(!gift.contains(syohin)) {
					gift.add(syohin);
				}
			}

				System.out.println(gift.size());

			}
		}
