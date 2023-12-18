import java.util.*;
public class Main{
    public static void main(String sp[]){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=0;i<n;i++){
			al.add(sc.nextInt());	
		}
		int max = Collections.max(al);
		int smax=0;
		for(int i=0;i<n;i++){
			if(al.get(i)>smax && al.get(i)<max){
				smax=al.get(i);
			}
		}
		for(int i=0;i<n;i++){
			int val = al.get(i);
			if(val==max){
				if(smax>0){
					System.out.println(smax);
				}else System.out.println(max);
			}else if(val!=max){
				System.out.println(max);
			}
		}
	}
}