import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		String st[] = sc.next().split("");
		boolean used[] = new boolean[st.length];
		int count = 0;

		for(int i = 0;i < st.length-1;i++){
			if(st[i].equals("S") && st[i+1].equals("T")){
				count++;
				used[i] = true;
				used[i+1] = true;
				int left = i-1;
				int right = i+2;
				//int j = 1;
				//System.out.println("left:"+left+" right:"+right);
				while(left >= 0 && right < st.length
						&& !used[left] && !used[right]
								&& st[left].equals("S") && st[right].equals("T")){
					count++;
					used[left--] = true;
					used[right++] = true;
					//System.out.println(j+"回目");
				}
				i = right-1;
				//System.out.println("i;"+i);
			}
		}

		//System.out.println(count);
		System.out.println(st.length-count*2);
	}
}
