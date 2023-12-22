import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int target = 0;
		int d = 0;
		int count = 0;
      	boolean flg = true;
		List<Integer> l = new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			l.add(sc.nextInt());
		}
		for(int i=0;i<n;i++){
			target = l.get(i);
			for(int j=0;j<n;j++){
				d= l.get(j);
				if(i!=j&&target%d==0){
					flg = false;
				}
			}
			if(flg==true){
				count++;
			}
			flg = true;
		}
		System.out.println(count);
	}
}