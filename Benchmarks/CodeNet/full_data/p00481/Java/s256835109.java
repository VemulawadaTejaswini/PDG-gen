import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
		 int H=scanner.nextInt();
		 int W=scanner.nextInt();
		 int N=scanner.nextInt();
		 scanner.nextLine();
		 StringBuffer bf1=new StringBuffer();
		 for(int i=0;i<H;i++){
			bf1.append(scanner.nextLine().trim());
		 }
		 bf1.trimToSize();
		 scanner.close();
		 int start=bf1.indexOf("S");
		 List<Integer> list=new ArrayList<Integer>();
		 list.add(start);
		 int result=0;
		 for(int T=1;T<=N;T++){
		StringBuffer bf=new StringBuffer(bf1);//拷?一个副本
		bf.trimToSize();
		 int level=1;//??一次有几个
		 while(!list.isEmpty()){
			 result++;
			 int levlel_=0;
			 for(int i=0;i<level;i++){
				 int pos=list.remove(0);
				 char c=bf.charAt(pos);
				 if(c==(""+T).charAt(0)){//找到
					 list.clear();
					  break;
				 }
				 bf.setCharAt(pos, 'X');
				 if(pos%W+1<W&&bf.charAt(pos+1)!='X'&&!list.contains(pos+1)){//右
						list.add(pos+1);
						levlel_++;
				 }
				 
				 if(pos+W<bf.length()&&bf.charAt(pos+W)!='X'&&!list.contains(pos+W)){//下
						list.add(pos+W);
						levlel_++;
				 }
				 if(pos%W-1>=0&&bf.charAt(pos-1)!='X'&&!list.contains(pos-1)){//左
						list.add(pos-1);
						levlel_++;
				 }
				 if(pos-W>=0&&bf.charAt(pos-W)!='X'&&!list.contains(pos-W)){//上
						list.add(pos-W);
						levlel_++;
				 }
			 }
			 level=levlel_;
		 }
		 if(T<N){//?没有找完
		 bf1.setCharAt(start, '.');
		 start=bf1.indexOf(""+T);
		 bf1.setCharAt(start, 'S');
		 list.add(start);
		 }
		 bf=null;
		 }
		 System.out.printf("%d\n", result-N);

	}

}