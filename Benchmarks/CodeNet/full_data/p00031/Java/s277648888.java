import java.util.ArrayList;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int n;
		while(sc.hasNextInt()){
			n = sc.nextInt();
			
			if(n >= 512){
				n -= 512;
				list.add(512);
			}
			if(n >= 256){
				n -= 256;
				list.add(256);
			}
			if(n >= 128){
				n -= 128;
				list.add(128);
			}
			if(n >= 64){
				n -= 64;
				list.add(64);
			}
			if(n >= 32){
				n -= 32;
				list.add(32);
			}
			if(n >= 16){
				n -= 16;
				list.add(16);
			}
			if(n >= 8){
				n -= 8;
				list.add(8);
			}
			if(n >= 4){
				n -= 4;
				list.add(4);
			}
			if(n >= 2){
				n -= 2;
				list.add(2);
			}
			if(n >= 1){
				n -= 1;
				list.add(1);
			}
			for(int i = 0; i < list.size(); i++){
				if(i != list.size() - 1)
					System.out.print(list.get(list.size() - i - 1) + " ");
				else
					System.out.println(list.get(0));
			}
			list.clear();
		}
		sc.close();
	}
}