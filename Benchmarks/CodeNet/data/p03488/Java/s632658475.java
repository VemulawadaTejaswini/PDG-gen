import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int x = in.nextInt();
		int y = in.nextInt();
		in.close();
		List<Integer> lr = new ArrayList<>();
		List<Integer> ud = new ArrayList<>();
		boolean lrDir = true;
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='F') count++;
			else {
				if(lrDir) {
					if(count>0) lr.add(count);
					count = 0;
					lrDir = false;
				}else {
					if(count>0) ud.add(count);
					count = 0;
					lrDir = true;
				}
			}
		}
		if(lrDir) {
			if(count>0) lr.add(count);
		}else {
			if(count>0) ud.add(count);
		}
		
		int lrsum = 0;
		for(int i=0;i<lr.size();i++) {
			lrsum += lr.get(i);
		}
		Set<Integer> xSet = new HashSet<>();
		if(lrsum>=x && x>=-lrsum) {
			xSet.add(x);
			for(int i=0;i<lr.size();i++) {
				int dist = lr.get(i);
				lrsum -= dist;
				Set<Integer> tmpSet = new HashSet<>();
				for(int nowX:xSet) {
					if(nowX+dist<=lrsum) tmpSet.add(nowX+dist);
					if(nowX-dist>=-lrsum) tmpSet.add(nowX-dist);
				}
				xSet = tmpSet;
			}
		}
		
		int udsum = 0;
		for(int i=0;i<ud.size();i++) {
			udsum += ud.get(i);
		}
		Set<Integer> ySet = new HashSet<>();
		if(udsum>=y && y>=-udsum) {
			ySet.add(y);
			for(int i=0;i<ud.size();i++) {
				int dist = ud.get(i);
				udsum -= dist;
				Set<Integer> tmpSet = new HashSet<>();
				for(int nowY:ySet) {
					if(nowY+dist<=lrsum) tmpSet.add(nowY+dist);
					if(nowY-dist>=-lrsum) tmpSet.add(nowY-dist);
				}
				ySet = tmpSet;
			}
		}
		
		if(xSet.contains(0) && ySet.contains(0)) System.out.println("Yes");
		else System.out.println("No");

	}

}
