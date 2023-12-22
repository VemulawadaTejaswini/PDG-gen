import java.util.*;

class Main{
	public static void main(String[] A){
		Scanner s=new Scanner(System.in);

		while(true){
			String a=s.next().replaceAll("\""," \"");
			if(a.equals("."))
				return;
			String b=s.next().replaceAll("\""," \"");

			String[] aa=a.split("\""),bb=b.split("\"");

			if(aa.length!=bb.length){
				System.out.println("DIFFERENT");
				continue;
			}
			int c=0;
			for(int i=0;i<aa.length;++i){
				if(!aa[i].equals(bb[i])) {
					if(i%2==0||c==1){
						c=2;
						break;
					}
					c=1;
				}
			}
			System.out.println(c==0?"IDENTICAL":c==1?"CLOSE":"DIFFERENT");
		}
	}
}

