import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {

	public static void main(String[] args)throws IOException, NumberFormatException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		Deque<Integer> list=new ArrayDeque<Integer>();
		for(int i=0;i<n;i++){
			String command=br.readLine();
			if(command.charAt(0)=='i'){
				list.offerFirst(Integer.parseInt(command.substring(7)));
			}else if(command.charAt(6)==' '){
				list.remove(Integer.parseInt(command.substring(7)));
			}else if(command.charAt(6)=='F'){
				list.removeFirst();
			}else if(command.charAt(6)=='L'){
				list.removeLast();
			}
		}
		while(list.size()!=1){
			System.out.print(list.poll()+" ");
		}
		System.out.println(list.poll());
	}

}