import java.util.Scanner;
import java.util.ArrayList;
class Procon{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}
			if(n == 1){
				System.out.println(scan.nextInt());
				continue;
			}
			ArrayList<Integer> alist = new ArrayList<Integer>();
			int temp = scan.nextInt();
			boolean sw;
			if(temp > 0){
				sw = true;
			}else{
				sw = false;
			}
			for(int i = 0;i < n-1;i++){
				int a = scan.nextInt();
				if(a > 0){
					if(sw){
						temp += a;
					}else{
						alist.add(temp);
						temp = a;
						sw = true;
					}
				}else{
					if(sw){
						alist.add(temp);
						temp = a;
						sw = false;
					}else{
						temp += a;
					}
				}
			}
			alist.add(temp);
			if(alist.size() == 1){
				System.out.println(alist.get(0));
				continue;
			}
			int max = 0;
			int b = 0;
			for(int i = alist.size()-1;i >= 0;i--){
				temp = alist.get(i);
				if(max < temp + b){
					max = temp + b;
				}
				b += temp;
				if(b < 0){
					b = 0;
				}
			}
			System.out.println(max);
		}
	}
}