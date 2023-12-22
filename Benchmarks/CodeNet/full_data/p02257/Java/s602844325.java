import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line);
        int s_cnt=0;
        for(int i=0;i<n;i++){
        	String line2 = br.readLine();
        	int a = Integer.parseInt(line2);
        	int cnt=0;
        	for(int j=2;j<a-1;j++){
        		if(a%j==0)cnt++;
        	}
        	if(cnt==0&&a!=1)s_cnt++;
        }
        System.out.println(s_cnt);
	}
}