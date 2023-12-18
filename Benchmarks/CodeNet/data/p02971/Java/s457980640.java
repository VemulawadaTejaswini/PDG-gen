import java.util.*;
public class Main{
    public static void main(String sp[]){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		ArrayList<Integer> al1 = new ArrayList<>();
		for(int i=0;i<n;i++){
			int temp = sc.nextInt();
			al.add(temp);
			al1.add(temp);
		}
		Collections.sort(al1,Collections.reverseOrder());
		int max = al1.get(0);
		int smax= al1.get(1);
		
		for(int i=0;i<n;i++){
			int val = al.get(i);
			if(val==max){
				System.out.println(smax);
			}else if(val!=max){
				System.out.println(max);
			}
		}
	}
}