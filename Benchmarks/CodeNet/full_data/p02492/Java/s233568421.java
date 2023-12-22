import java.io.*;
public class Main{
	public static void main(String[] args){
		//??????????????¬??§
		String[] ops = {"+", "-", "*", "/", "?"};
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int result = 0;
		boolean hatena = false;
		try{//IOException
			while(null != (line=reader.readLine())){
				boolean f_calc = false;
				String[] linearr = line.split(" ");
				for(int i=0; i<5; i++){
					//???????????????
					if(linearr[1].equals(ops[i])){
						f_calc = true;
						if(i==4){
							hatena = true;
							break;
						}else{
							int a = Integer.parseInt(linearr[0]);
							int b = Integer.parseInt(linearr[2]);
							switch(i){
								case 0:
									result = a+b;
								break;
								case 1:
									result = a-b;
								break;
								case 2:
									result = a*b;
								break;
								case 3:
									result = (int)(a/b);
								break;
							}
							break;
						}
					}
				}
				if(!f_calc){
					throw new IllegalArgumentException("?????????"+linearr[1]+"????????¨?????????");
				}
				if(hatena){
					break;
				}else{
					System.out.println(result + "");
				}
			}
		}catch(IOException e){
			System.out.println(e);
		}
		
	}
}