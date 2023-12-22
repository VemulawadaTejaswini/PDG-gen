import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		List<Long> a = new ArrayList<Long>();
		List<Long> minus = new ArrayList<Long>();
		boolean b= false;
		for (int i=0;i<N;i++) {
			long temp = sc.nextLong();
			if (temp>0) {
				a.add(temp);
			} else if (temp==0) {
				b = true;
			} else {
				minus.add(temp);
			}
		}
		Collections.sort(a);
		Collections.sort(minus);
		if (K==N&&b==false) {
			long result=1;
			for (int i=0;i<a.size();i++) {
				result = (result *a.get(i))%1000000007;
			}
			for (int i=0;i<minus.size();i++) {
				result = (result *minus.get(i))%1000000007;
			}
			System.out.println(result);
		} else if (K>a.size()+minus.size()) {
			System.out.println(0);
		} else if (a.size()>0){
			BigDecimal big = new BigDecimal(1);
			int start=0;
			int count =a.size();
			int startB=0;
			if (K>a.size()) {
				if ((K-a.size())%2==1) {
					for (int i=1;i<a.size();i++) {
						big = big.multiply(new BigDecimal(a.get(i)));
						start =1;
						count +=a.size()-1;
					}
				} else {
					for (int i=0;i<a.size();i++) {
						big = big.multiply(new BigDecimal(a.get(i)));
					}
				}
				for (int i=0;i<K-count;i++) {
					big = big.multiply(new BigDecimal(minus.get(i)));
					startB= i;
				}
			} else {
				for (int i=0;i<K;i++) {
					big = big.multiply(new BigDecimal(a.get(a.size()-1-i)));
				}
			}
			int max =start;
			for (int i=start;i+1<a.size();i+=2) {
				BigDecimal temp = big;
				temp = big.divide(new BigDecimal(a.get(i)));
				temp = temp.divide(new BigDecimal(a.get(i+1)));
				if (startB+1>=minus.size()) {
					break;
				}
				temp = temp.multiply(new BigDecimal(minus.get(startB)));
				temp = temp.multiply(new BigDecimal(minus.get(startB+1)));
				startB+=2;
				if (temp.compareTo(big)==1) {
					max = i+2;
				}
				big = temp;
			}
			long result=1;
			for (int i=max;i<a.size();i++) {
				result = (result *(a.get(i)))%1000000007;
			}
			for (int i=0;i<K-(a.size()-max);i++) {
				result = (result *(minus.get(i)))%1000000007;
			}
			if (result<0) {
				result +=1000000007;
			}
			System.out.println(result%1000000007);
		} else {
			long result =1;
			for (int i=0;i<K;i++) {
				result = (result *(minus.get(minus.size()-1-i)))%1000000007;
			}
			if (result<0) {
				result +=1000000007;
			}
			System.out.println(result%1000000007);
		}
	}
}