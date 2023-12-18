import java.math.BigInteger;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		boolean fa=false;
		int count=0;
		List<Integer> li=new ArrayList<Integer>();
		List<String>  s=new  ArrayList<String>();
		List<Integer> qq=new ArrayList<Integer>();
		for(int i=0;i<a;i++) {
			li.add(sc.nextInt());
			s.add(sc.next());
		}
		int gg=s.size();
		while(true) {
			if(s.size()==0) {
				break;
			}
			if(s.get(gg).equals("WA")) {
				s.remove(gg);
				li.remove(gg);
				gg--;
			}
			else {
				break;
			}
		}
		for(int i=0;i<s.size();i++) {
			if(s.get(i).equals("AC")) {
				if(fa) {
					int sss=0;
					for(int j=0;j<qq.size();j++) {
						if(qq.get(j)==li.get(i)) {
							sss=1;
						}
					}
					if(sss==0) {
						qq.add(li.get(i));
					}
				}
				else {
					qq.add(li.get(i));
				}
			}
			else {
				count++;
			}
		}
		System.out.println(qq.size()+" "+count);
		sc.close();
	}
}
