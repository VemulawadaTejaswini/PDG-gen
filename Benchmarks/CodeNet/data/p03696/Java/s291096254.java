import java.util.Scanner;

/**
 * https://abc064.contest.atcoder.jp/tasks/abc064_d
 */
public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] s = sc.next().toCharArray();
		sc.close();
		
		int current = 0;
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<N; i++){
			String c = Character.toString(s[i]);
			if(c.equals("(")){
				current++;
				sb.append(c);
			}else{
				if(current>0){
					sb.append(c);
					current--;
				}else{
					sb = new StringBuilder("("+ sb.toString()+")");
				}
			}
		}
		for(int i=0; i<current; i++){
			sb.append(")");
		}
		
		System.out.println(sb);

	}

}