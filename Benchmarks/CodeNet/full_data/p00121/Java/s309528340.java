
import java.util.*;

public class Main{
static final int[] dir={1,-1,4,-4};
static Map<String,Integer> m=new HashMap<String,Integer>();
static void bfs(){
	String s="01234567";
	m.put(s,0);
	Queue<String> que=new LinkedList<String>();
	que.offer(s);
	while(!que.isEmpty()){
		String tmp=que.poll();
		int step=m.get(tmp);
		//find'0'
		int index=0;
		for(int i=0;i<8;i++)
			if(tmp.charAt(i)=='0') {index=i;break;}
		//move'0'
		for(int i=0;i<4;i++){
			if((index==3&&dir[i]==1)||(index==4&&dir[i]==-1)) continue;
			int newindex=index+dir[i];
			if(newindex>=0&&newindex<8){
				//exchange
				StringBuffer sss=new StringBuffer(tmp);
				sss.setCharAt(index, tmp.charAt(newindex));
				sss.setCharAt(newindex, tmp.charAt(index));
				//System.out.println(tmp+"  "+sss.toString());
				String tmp1=sss.toString();
				//if no visit?憩nqueue
				if(m.get(tmp1)==null){
					m.put(tmp1,step+1);
					que.offer(tmp1);
				}
			}
		}
	}
}
public static void main(String[] args){
	bfs();
	String input=null;
	Scanner scan=new Scanner(System.in);
	while((input=scan.nextLine())!=null){
		input=input.replace(" ","");
		System.out.println(m.get(input)==null?0:m.get(input));
	}
	scan.close();
}
}