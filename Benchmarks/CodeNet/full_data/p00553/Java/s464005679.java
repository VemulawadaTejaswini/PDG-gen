import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO ?????????????????????????????????????????????
		int[] arg =new int[100];
        int i=0,sum=0,n=0,m=0;
        int[] dist=null,weather=null;
        int state=0;

        int[] k=new int[5];
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
                k[0]=Integer.parseInt(line);
                k[1]=Integer.parseInt(br.readLine());
                k[2]=Integer.parseInt(br.readLine());
                k[3]=Integer.parseInt(br.readLine());
                k[4]=Integer.parseInt(br.readLine());
                if(k[0]<0){
                	System.out.println(Math.abs(k[0])*k[2]+k[3]+k[1]*k[4]);
                }else{
                	System.out.println((k[1]-k[0])*k[4]);
                }
                break;
            }
        }
	}

}