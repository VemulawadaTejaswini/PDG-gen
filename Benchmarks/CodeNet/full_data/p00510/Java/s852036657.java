import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
        // TODO ?????????????????????????????????????????????
        int max=0,tunnel=0,in=0,out=0;
        int time=0;
        boolean first=true;
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            String line;
            while ((line = br.readLine()) != null) {
            	if(first){
            		time=Integer.parseInt(line);
            		tunnel=Integer.parseInt(br.readLine());
            		max=tunnel;
            		first=false;
            	}else{
            		String[] str=line.split(" ");
            		in=Integer.parseInt(str[0]);
            		out=Integer.parseInt(str[1]);
            		if(in+tunnel-out<0){
            			System.out.println(0);
            			return;
            		}else{
            			tunnel=in+tunnel-out;
            			if(max<tunnel){
            				max=tunnel;
            			}
            		}
            	}
            	time--;
            	if(time<0){
            		break;
            	}
            }
            System.out.println(max);  
        }
    }

}