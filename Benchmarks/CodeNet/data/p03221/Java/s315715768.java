import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * 一堆区域里有一堆城市，要求输出城市的ID
 * @author SDSC
sample input1
2 3
1 32
2 63
1 12
sample output1
000001000002
000002000001
000001000001

sample input2
2 3
2 55
2 77
2 99
sample output2
000002000001
000002000002
000002000003

1 5
1 999
1 888
1 9999999
1 2
1 159875
1000000999 000001000003
1000000888 000001000002
1009999999 000001000005
1000000002 000001000001
1000159875 000001000004


 */
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int Pcount=sc.nextInt();//区块的总个数 10的五次方
		int cityCount=sc.nextInt();//城市的总格式 10的五次方
		List<Long> inputList=new ArrayList<Long>();
		List<Long> inputList2=new ArrayList<Long>();
		for(int i=0;i<cityCount;i++) {
			int p=sc.nextInt();
			int year=sc.nextInt();//年份  10的九次方
			String yearZero=Append9Zero(year);
			inputList.add(Long.valueOf(p+yearZero));
			inputList2.add(Long.valueOf(p+yearZero));
		}
		sc.close();
		
		Collections.sort(inputList);
		int index=0;
		Map<Long,String> map=new HashMap<Long,String>();
		for(int i=0;i<inputList.size();i++) {//需要区域
			index++;
			String a=inputList.get(i).toString();
			a=a.substring(0, a.length()-9);//当前的区域ID
			if(i>0){
				String b=inputList.get(i-1).toString();
				b=b.substring(0, b.length()-9);
				if(!a.equals(b)) {//需要重新计数了
					index=1;
				}
			}
			map.put(inputList.get(i), AppendZero(Integer.valueOf(a))+AppendZero(Integer.valueOf(index)));
		}
		for(Long l:inputList2) {
			System.out.println(map.get(l));
		}
		
	}

	private static String AppendZero(int z) {
		int len=6;
		String s=String.valueOf(z);
		int appLen=len-s.length();
		for(int i=0;i<appLen;i++) {
			s="0"+s;
		}
		return s;
	}
	private static String Append9Zero(int z) {
		int len=9;
		String s=String.valueOf(z);
		int appLen=len-s.length();
		for(int i=0;i<appLen;i++) {
			s="0"+s;
		}
		return s;
	}
	
	

}
