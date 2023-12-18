import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		String b=sc.nextLine();
		String K ;
		StringBuilder builder=new StringBuilder("");
		for(int i=0;i<b.length();i++) {
			K=b.substring(i,i+1);
			if(K.equals("B")&&builder.length()>0) {//如果是B空格键就删除前面的元素,如果不是添加进集合中
				builder.delete(i-1,i );
			}else if(K.equals("1")) {
				builder.append(K);
			}else if(K.equals("0")){
				builder.append(K);
			}
		}
		System.out.println(builder.toString());
         }
}		
		