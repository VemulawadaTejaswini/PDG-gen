import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main
{
    public static void main(String[] args) throws IOException
    {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=br.readLine())!=null){
			String[] nums = s.split(" ");
			ArrayList<Integer> num = new ArrayList<Integer>();
			for(int i=0; i<5; i++)
				num.add(Integer.parseInt(nums[i]));
			Collections.sort(num);
			for(int i=4; i>0; i--)
				System.out.print(num.get(i)+" ");
			System.out.println(num.get(0));
		}
    }
}