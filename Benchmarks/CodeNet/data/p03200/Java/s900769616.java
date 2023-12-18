import java.util.Scanner;

public class Main{
	static public void  main(String[] args){
		Scanner scan = new Scanner(System.in);

		String a = scan.next();
		boolean[] start = new boolean[a.length()];
		for(int i = 0; i < a.length();i++){
			start[i] = 'B' == a.charAt(i);
		}
		int count = 0;
		int prechangeidx = 0;
		while (true){
			int precount = count;
			for(int i = 0; i < a.length() -1 ;i++){
				if (start[i] && !start[i+1]){
					start[i] = !start[i];
					start[i+1] = !start[i+1];
					count ++;
					prechangeidx = i - 1 ;
					if(prechangeidx < 0) prechangeidx =0;
					break;
				}

			}
			if(precount == count) break;
		}

		System.out.println(count);
	}
}
