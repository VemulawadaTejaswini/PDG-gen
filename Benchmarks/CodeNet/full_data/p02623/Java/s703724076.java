import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();
		ArrayList<Integer> a = new ArrayList<>();
		ArrayList<Integer> b = new ArrayList<>();
		long time = 0;
		int count = 0,index = 0;
		boolean flag= true;
		for(int i = 0;i < n;i++)
			a.add(scan.nextInt());
		for(int i = 0; i<m;i++)
			b.add(scan.nextInt());
		while(flag) {
			if((a.size()==0&&b.size()!=0)||(a.size()!=0&&b.size()!=0)&&(b.get(0)<a.get(0))) {
				time+=b.get(0);
				b.remove(0);
			}else if(a.size()!=0 && b.size()==0||(a.size()!=0&&b.size()!=0)&&(a.get(0)<=b.get(0))) {
				time +=a.get(0);
				a.remove(0);
			}
			if(time<=k) 
				count++;
			if(time>k||a.size()==0&&b.size()==0)
				flag= false;
		}
		System.out.println(count);
		
	}

}
