import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int[] value = new int[10];
		int x = 512;
		List<Integer> v = new ArrayList<Integer>();
		for(int i=0;i<10;i++){
			value[i] = x;
			x /= 2;
		}

		while(sc.hasNext()){
			int w = sc.nextInt();
			v.clear();
			for(int i=0;i<10;i++){
				if(value[i] <= w){
					w -= value[i];
					v.add(value[i]);
				}
			}
			for(int i=v.size()-1; i >= 0 ; i--){
				if(i == 0) {
					System.out.println(v.get(i));
				}else{
					System.out.print(v.get(i) + " ");
				}
			}
		}
	}
}