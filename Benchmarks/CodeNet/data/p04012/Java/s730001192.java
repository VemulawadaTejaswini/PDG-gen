import java.util.*;
public  class Main {
   
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc=new Scanner(System.in);
	    String W=sc.nextLine();
	    //把字母存入字符串数组
	    String[] W_Arrays=new String[W.length()];
	    for(int i=0;i<W.length();i++) {
	    	W_Arrays[i]=W.substring(i, i+1);
	    }
	    //利用数组删除相同元素，减少for循环的运行时间
	    List<String> list=new ArrayList<String>();
	    list.addAll(Arrays.asList(W_Arrays));
	   
	    //k用于判断元素是否出现偶数次
	    int k=1,n=0,j=1;
	    boolean flag=true;
	    while(flag) {
	    	while(j<list.size()) {
	    		
	    		if(list.get(n).equals(list.get(j))){
	    			k++;
	    			list.remove(list.get(j));
	    		}
	    		j++;
	    	}
	    	//第二层循环完毕，判断k是否为偶数
	    	if(k%2!=0) {
	    		System.out.println("NO");
	    		flag=false;//不为0则退出第一层循环，输出结果
	    	}else {
	    		list.remove(list.get(n));//如果为偶数则删除最开始的元素
	    		k=1;
	    		j=1;
	    	}
	    
	    	if(list.size()==0) {
	    	System.out.println("YES");
	    	flag=false;//退出循环
	    	}
	    }
	}
}

	
	
	
	
	
	
	
	
	
	
	