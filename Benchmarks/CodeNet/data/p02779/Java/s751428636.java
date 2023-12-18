import java.io.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			String line = new String(in.readLine());
			int num = Integer.parseInt(line);//N
			//System.out.println(num);
			line = new String(in.readLine());
			String[] input = new String[num];//空白ごとに値をスプリット
			input = line.split(" ");
			int nums[] = new int[num];
			boolean flag = true;
			for(int i = 0;i < num;i++) {
				nums[i] = Integer.parseInt(input[i]);
				for(int j = 0;j < i;j++) {
					if(nums[j] == nums[i]) {
						flag = false;
					}
				}
			}
			if(flag == true) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
			
		} catch (IOException e) {
			System.out.print(e);
		}
	}

}
