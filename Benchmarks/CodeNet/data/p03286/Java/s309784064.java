import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();

		if(N == 0){
			System.out.println(0);

		}
		else{
			Deque<Integer> stack = new ArrayDeque<Integer>();

			int tmp = 0;
			for(int i = 1 ; i < 1000000000 ; i*=(-2)){
				//System.out.println("i : " + i);
				if(N%(i*(-2))==0){
					//System.out.print(0);
					stack.push(0);
				}
				else{
					if(tmp == 0){
					tmp = N-i;
					}
					else{
						tmp = tmp-i;
					}
					//System.out.println("tmp :" + tmp);
					if(tmp%(i*(-2)) == 0){
						//System.out.print(1);
						stack.push(1);
					}
					else{
						//System.out.print(0);
						stack.push(0);
						tmp = tmp+i;
					}
				}
			}
			int flag = 0;
			int ff = stack.size();
			for(int i = 0 ; i < ff ; i++){
				int a = stack.poll();
				if(flag == 0 && a == 0){
					continue;
				}else{
					System.out.print(a);
					flag++;
				}
			}
		}

	}
}
