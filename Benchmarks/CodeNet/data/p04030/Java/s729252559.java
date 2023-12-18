import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
		String b=sc.nextLine();
		String K ;
		int j=0;
		StringBuilder builder=new StringBuilder("");
		for(int i=0;i<b.length();i++) {
			K=b.substring(i,i+1);
			if(K.equals("B")&&builder.length()>0) {//如果是B空格键就删除前面的元素,如果不是添加进集合中
				builder.delete(j-1,j);
				j--;
			}if(K.equals("1")) {
				builder.append(K);
				j++;
			}if(K.equals("0")){
				builder.append(K);
				j++;
			}
		}
		System.out.println(builder.toString());
          }
}
		