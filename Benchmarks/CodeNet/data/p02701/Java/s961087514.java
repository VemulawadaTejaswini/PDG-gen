import java.util.*;

public class Main{
//public class abc164_c{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		String[] str = new String[n];
		int kind = 0;
		boolean flag = false;

		for(int i=0; i <n; i++){
			str[i] = scan.next();
			flag = false;
			for(int j =0; j < i; j++){
				if(str[j].equals(str[i])) flag = true;
			}
			if(!flag) kind++;
		}



		System.out.println(kind);
	}

}