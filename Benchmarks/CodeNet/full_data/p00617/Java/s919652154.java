import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {

	static char[] s;
	static int idx;
	static Panel now;
	static List<Panel> list;
	public static void main(String[] args) {
		Scanner cin = new Scanner(System.in);
		for(;;){
			int N=cin.nextInt();
			if(N==0)break;
			idx=0;
			s=(cin.next()+"   ").toCharArray();
			list=new LinkedList<Panel>();
			strc();
			for(Panel p:list){
//				System.out.println(p);
				if(p.children.size()!=0){
					for(Panel c:p.children){
//						System.out.println("children "+c);
					}

				}
				if(p.parent!=null){
//					System.out.println("parent "+p.parent);
				}
			}
			for(int i=0;i<N;i++){
				int[] a=new int[2];
				a[0]=cin.nextInt();
				a[1]=cin.nextInt();
				boolean f=false;
				for(Panel p:list){
					Panel ans=ans(a,p);
					if(ans!=null){
						System.out.println(ans);
						f=true;
						break;
					}
				}
				if(!f){
					System.out.println("OUT OF MAIN PANEL 1");
				}
			}
		}
	}
	static boolean strc(){
		if(s[idx+1]=='/'){
			return false;
		}
		idx++;
		String name=start();
		int[] p=value();
		Panel panel=new Panel(name,p);
		if(now!=null){
			now.children.add(panel);
			panel.parent=now;
		}
		now=panel;
		list.add(panel);

		while(strc());
		end();
		if(now.parent!=null){
			now=panel.parent;
		}
		return true;
	}
	static void end(){
		while(s[idx]!='>'){
			idx++;
		}
		idx++;
	}
	static String start(){
		String re="";
		for(;s[idx]!='>';){
			re=re+s[idx++];
		}
		idx++;
		return re;
	}
	static int[] value(){
		String re="";
		for(;s[idx]!='<';){
			re=re+s[idx++];
		}
		String[] ss=re.split(",");
		int[] p=new int[4];
		for(int i=0;i<4;i++){
			p[i]=Integer.parseInt(ss[i]);
		}
		return p;
	}
	static Panel ans(int[] a,Panel p){
		if(in(a,p.p)){
			for(Panel child:p.children){
				if(in(a,child.p)){
					return ans(a,child);
				}
			}
			return p;
		}
		else{
			return null;
		}
	}
	//点a、面b
	static boolean in(int[] a,int[] b){
		for(int i=0;i<2;i++){
			if(b[i]>a[i]||b[i+2]<a[i])return false;
		}
		return true;
	}
	static class Panel{
		String name;
		Panel parent;
		int[] p;
		List<Panel>children;
		Panel(String s,int[] a){
			name=s;
			p=new int[4];
			children=new LinkedList<Panel>();
			for(int i=0;i<4;i++){
				p[i]=a[i];

			}
		}
		public String toString(){
			return name+" "+children.size();
		}
	}
}