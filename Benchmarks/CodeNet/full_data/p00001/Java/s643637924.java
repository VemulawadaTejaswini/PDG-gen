import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		int[] arg =new int[10];
		for(int i=0;i<10;i++){
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String buf = null;
			try {
				buf = br.readLine();
			} catch (IOException e) {
				// TODO ????????????????????? catch ????????????
				e.printStackTrace();
			}
			arg[i] = Integer.parseInt(buf);
		}
		int[] store=new int[3];
		for(int i=0;i<10;i++){
			int s=arg[i];
			for(int j=0;j<3;j++){
				if(s>store[j]){
					if(j==0){
						store[j+2]=store[j+1];
						store[j+1]=store[j];
						store[j]=s;
						break;
					}else if(j==1){
						store[j+1]=store[j];
						store[j]=s;
						break;
					}else{
						store[j]=s;
					}
				}
			}
		}
		for(int i=0;i<store.length;i++){
			System.out.println(store[i]);
		}
	}

}