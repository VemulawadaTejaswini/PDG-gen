import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int first = 0;
		int second = 0;
		int firstIndex = -1;
		for(int i=0;i<N;i++){
			int A = sc.nextInt();
			if(A == first){
				firstIndex = -1;
				break;
			}else if(A > first){
				second = first;
				first=A;
				firstIndex = i;
			}else if(A>second)second=A;
		}
		if(firstIndex==-1){
			for(int i=0;i<N;i++){
				System.out.println(first);
			}	
		}else{
			for(int i=0;i<N;i++){
				if(firstIndex == i){
					System.out.println(second);
				}else{
					System.out.println(first);
				}
			}
		}
	}
}