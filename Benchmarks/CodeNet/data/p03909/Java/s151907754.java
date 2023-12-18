import java.util.*;

class Main{
	public static void main(String[] $){
		Scanner s=new Scanner(System.in);
		int h=s.nextInt(),w=s.nextInt();
		for(int i=1;i<=h;++i)
			for(int j=0;j<w;++j)
				if(s.next().equals("snuke"))
					System.out.println(""+(char)(j+'A')+i);
	}
}