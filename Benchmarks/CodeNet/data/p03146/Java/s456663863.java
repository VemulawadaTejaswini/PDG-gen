import java.util.*;
public class Main {
	public static void main(String[] args){
      	//データ取り込み
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int cnt = 1;
		int temp = N;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(N);
		boolean flg = true;
		while(flg){
			if(temp%2 == 0){
				cnt++;
				temp /=2;
				if(list.contains(temp)){
					break;
				}else{
					list.add(temp);
				}
			}else{
				cnt++;
				temp = 3*temp +1;
				if(list.contains(temp)){
					break;
				}else{
					list.add(temp);
				}
				
			}
		}
		System.out.println(cnt);		
    }
}