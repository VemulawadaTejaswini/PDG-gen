import java.util.*;
public class Main {
 public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	int tmp;
	if(a>b){tmp=a;a=b;b=tmp;}
	
	List<Integer> c = new LinkedList<Integer>();
	c.add(1);

	for(int i=a/GCD(a,b)+1;i<=a/2;i++){
		if(a%i==0)if(b%(a/i)==0)c.add(a/i);
	}//公約数のリスト
	
	//たがいにそ
	boolean check=true;
	int delcount;
	do{delcount=0;
		for(int i=1;i<c.size();i++){//大きい方から
			for(int cc:c){
				if(cc==1 || cc==c.get(i))continue;
				if(c.get(i)%cc==0){c.remove(i); delcount++; break;}
			}
		}
	}while(delcount>0);

	System.out.println(c.size());
 }
 
  public static int GCD(int x,int y){//xとyの最大公約数
	 int tmp;
	 //if(y>x){tmp=x;x=y;y=tmp;}
     while((tmp=x%y)!=0){x=y;y=tmp;}
	 return y;
 }

}