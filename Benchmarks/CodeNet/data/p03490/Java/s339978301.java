import java.util.*;
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc=new Scanner(System.in);
		
		Set<Integer> XSet=new TreeSet<Integer>();
		Set<Integer> YSet=new TreeSet<Integer>();
		YSet.add(0);
		boolean facingX=true;
		String s=sc.next()+"T";
		int temp=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='F') {
				temp++;
			}
			else {
				if(facingX) {
					for (Integer num: XSet) {
						XSet.remove(num);
						XSet.add(num+temp);
						XSet.add(num-temp);
					}
					if(XSet.isEmpty()) {
						XSet.add(temp);
					}
				}
				else {
					for (Integer num: YSet) {
						YSet.remove(num);
						YSet.add(num+temp);
						YSet.add(num-temp);
					}
				}
				temp=0;
				facingX=!facingX;
			}
		}
		
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(XSet.contains(x) && YSet.contains (y)) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
