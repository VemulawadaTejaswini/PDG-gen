import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	private static FastScanner sc = new FastScanner();

	public static void main(String[] args) {
		int[] num = new int[6];
		for(int i=0; i<num.length; i++){
			num[i] = sc.nextInt();
		}

		Dice dice = new Dice(num);

		char[] direction = sc.next().toCharArray();

		for(int i=0; i<direction.length; i++){
			dice.lotate(direction[i]);
		}

		System.out.println(dice.getUpside());

	}

	static class FastScanner
    {
        BufferedReader br;
        StringTokenizer st;

        public FastScanner()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }

	static class Dice {

		//0:?????¢???1:S??´??¢???2:E??´??¢???3:W??´??¢???4:N??´??¢???5:?????¢
		int[] num;

		Dice(int[] num){
			this.num = num;
		}

		int getUpside(){
			return num[0];
		}

		void lotate(char direction){
			int temp;
			switch(direction){
			case 'N':
				temp = num[0];
				num[0] = num[1];
				num[1] = num[5];
				num[5] = num[4];
				num[4] = temp;
				break;

			case 'S':
				temp = num[0];
				num[0] = num[4];
				num[4] = num[5];
				num[5] = num[1];
				num[1] = temp;
				break;

			case 'W':
				temp = num[0];
				num[0] = num[2];
				num[2] = num[5];
				num[5] = num[3];
				num[3] = temp;
				break;

			case 'E':
				temp = num[0];
				num[0] = num[3];
				num[3] = num[5];
				num[5] = num[2];
				num[2] = temp;
				break;
			}
		}

	}

}