
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br=
				new BufferedReader(new InputStreamReader(System.in));
		int iterate[];
		int questions[];
		ArrayList<Integer> work;
		Set<Integer> removed=new HashSet<Integer>();
		String buf=br.readLine();
		String sbuf[]=buf.split(" ");
		//?????°
		int num=Integer.parseInt(sbuf[0]);
		//??°?????????
		int iNum=Integer.parseInt(sbuf[1]);
		iterate=new int[iNum];
		//????????°
		int qNum=Integer.parseInt(sbuf[2]);
		questions=new int[qNum];

		//??£?¨?????????°?????????
		buf=br.readLine();
		sbuf=buf.split(" ");
		for(int i=0;i<iNum;i++) iterate[i]=Integer.parseInt(sbuf[i]);

		//????????????
		buf=br.readLine();
		sbuf=buf.split(" ");
		for(int i=0;i<qNum;i++) questions[i]=Integer.parseInt(sbuf[i]);

		work=new ArrayList<Integer>();
		for(int i=0;i<num;i++) work.add(i);

		for(int i=0,now=0;i<iNum;i++){
			int wNum=iterate[i];

			if(wNum%2==0) now=(now+wNum)%num;
			else{
				if((now-wNum)>=0){
					now-=wNum;
				}else{
					int b=num-((wNum-now)%num);
					now=b;
				}
			}
			removed.add(work.remove(now));
			num--;
		}
		for(int i=0;i<qNum;i++){
			System.out.println(removed.contains(questions[i])?"0":"1");
		}
	}
}