import java.util.*; 
 
public class Main
{
	public static void main(String args[]) throws Exception{
		new Main().run();
	}
	
	public void run()
	{
		int i,j,k;
		Scanner cin=new Scanner(System.in);
		while(true){
			String s = cin.nextLine();
			if(s.equals(".")) break;
			int count = 0;
			for(i=0;i<3;i++){
				for(j=0;j<3;j++){
					for(k=0;k<3;k++){
						String ss = s;
						ss = ss.replace("P", i + "");
						ss = ss.replace("Q", j + "");
						ss = ss.replace("R", k + "");
						while(true){
							ss = ss.replace("-0", "2");
							ss = ss.replace("-1", "1");
							ss = ss.replace("-2", "0");
							ss = ss.replace("(0+0)", "0");
							ss = ss.replace("(0+1)", "1");
							ss = ss.replace("(0+2)", "2");
							ss = ss.replace("(1+0)", "1");
							ss = ss.replace("(1+1)", "1");
							ss = ss.replace("(1+2)", "2");
							ss = ss.replace("(2+0)", "2");
							ss = ss.replace("(2+1)", "2");
							ss = ss.replace("(2+2)", "2");
							
							ss = ss.replace("(0*0)", "0");
							ss = ss.replace("(0*1)", "0");
							ss = ss.replace("(0*2)", "0");
							ss = ss.replace("(1*0)", "0");
							ss = ss.replace("(1*1)", "1");
							ss = ss.replace("(1*2)", "1");
							ss = ss.replace("(2*0)", "0");
							ss = ss.replace("(2*1)", "1");
							ss = ss.replace("(2*2)", "2");
							if(ss.length()==1) break;
						}
						if(ss.equals("2")){
							count++;
						}
					}
				}
			}
			System.out.println(count);
		}
	}
	
}