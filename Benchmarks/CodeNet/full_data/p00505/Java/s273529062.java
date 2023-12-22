import java.io.*;
public class Main {
	public static void main(String[]args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		int acute=0;
		int right=0;
		int obtuse=0;
		while(true){
			String[] sidestr=str.split(" ");
			int[] sides=new int[3];
			for(int i=0;i<3;i++)
				sides[i]=Integer.parseInt(sidestr[i]);
			sides=Sort(sides);
			if(sides[0]>=sides[1]+sides[2])
				break;
			else if(Math.pow(sides[0], 2)>Math.pow(sides[1], 2)+Math.pow(sides[2], 2))
				obtuse++;
			else if(Math.pow(sides[0], 2)==Math.pow(sides[1], 2)+Math.pow(sides[2], 2))
				right++;
			else
				acute++;
			str=br.readLine();
		}
		System.out.println((acute+right+obtuse)+" "+acute+" "+right+" "+obtuse);
	}
		private static int[] Sort(int[] num) {
		int length = num.length;
		for (int i = 1; i < length - 1; i++) {
			for (int j = 0; j < length - i; j++) {
				if (num[j] < num[j + 1]) {
					int tmpnum = num[j];
					num[j] = num[j + 1];
					num[j + 1] = tmpnum;
				}
			}
		}
		return num;
	}
}