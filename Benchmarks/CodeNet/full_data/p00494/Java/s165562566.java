
import java.util.*;
public class Main {
	Scanner in = new Scanner(System.in);
	public static void main(String[] args) {
		new Main();
	}

	public Main() {
		new AOJ0571().doIt();
	}


	class AOJ0571{
		void doIt(){
			char[] input = in.next().toCharArray();
			int result = 0;
			int n = input.length;
			for(int i=1;i<n;i++){// 間の数字
				int cnt = 0;
				boolean sw = false; //before 
				for(int s=0;s< n;s++){//探索
					if(s+i>=n)break;
					if(s+i+i>=n)break;
					if(input[s]!='J'){
						if(sw&&cnt>=i)result = Math.max(result, cnt);
						sw = false;
						cnt = 0;
					}
					//System.out.println("間== "+i+" now== "+s+" cnt== "+cnt+" "+input[s]+""+input[s+i]+""+input[s+i+i]);
					if(input[s]=='J'&&input[s+i]=='O'&&input[s+i+i]=='I'){
						cnt++;
						sw = true;
					}else if(sw){
						if(cnt>=i)result = Math.max(result, cnt);
						sw = false;
						cnt = 0;
					}
				}
				if(sw==false)cnt = 0;
				else if(cnt>=i)result = Math.max(result, cnt);
			}
			System.out.println(result);
		}
	}

}