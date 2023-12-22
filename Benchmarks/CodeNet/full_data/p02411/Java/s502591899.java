import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> m = new ArrayList<Integer>();
		List<Integer> f = new ArrayList<Integer>();
		List<Integer> r = new ArrayList<Integer>();

		 for(int i=0;;i++){
			 m.add(i, scan.nextInt());
			 f.add(i, scan.nextInt());
			 r.add(i, scan.nextInt());
			 if(m.get(i)==-1 && f.get(i)==-1 && r.get(i)==-1) break;
		 }

		 for(int i=0;;i++){
			 if(m.get(i)==-1 && f.get(i)==-1 && r.get(i)==-1) break;
			judgeGrade(m.get(i),f.get(i),r.get(i));
		 }
	}

	static void judgeGrade(int mid,int last,int re){
		if(mid==-1 || last==-1){
			System.out.println("F");
		}else if(mid+last >= 80){
			System.out.println("A");
		}else if(mid+last >= 65){
			System.out.println("B");
		}else if(mid+last >= 50 || re >= 50) {
			System.out.println("C");
		}else if(mid+last >= 30){
			System.out.println("D");
		}else{
			System.out.println("F");
		}

	}

}