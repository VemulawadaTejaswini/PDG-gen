import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	static class Subset {
		Long money;
		Long number;
		
		Subset(Long money, Long number){
			this.money = money;
			this.number = number;
		}

		public Long getMoney() {
			return money;
		}

		public void setMoney(Long money) {
			this.money = money;
		}

		public Long getNumber() {
			return number;
		}

		public void setNumber(Long number) {
			this.number = number;
		}
		
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long m = sc.nextLong();
		
		List<Subset> list = new ArrayList<Subset>();
		for(int i=0; i<n; i++) {
			Subset ss = new Subset(sc.nextLong(), sc.nextLong());
			list.add(ss);
		}
		
		Collections.sort(list, new Comparator<Subset>() {
            public int compare(Subset o1, Subset o2) {
                return (o1.getMoney()).compareTo(o2.getMoney());
            }
        });
		long nokori = 0;
		long sum = 0;
		long cnt = 0;
		int i=0;
		for(; i<list.size(); i++) {
			cnt += list.get(i).getNumber();
			if(cnt>=m) {
				break;
			}else {
				continue;
			}
		}
		for(int p=0; p<i; p++) {
			sum += list.get(p).getMoney()*list.get(p).getNumber();
		}
		nokori = list.get(i).getNumber() - (cnt - m);
		sum += nokori*list.get(i).getMoney();
		System.out.println(sum);
	}
}
