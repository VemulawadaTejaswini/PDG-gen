import java.io.BufferedReader;
import java.io.InputStreamReader;
class Main {
    public static void main(String[] args) throws Exception{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));// ??\????????????????????????
            String line = null;
            while((line = br.readLine()) != null){
            	String lines[] = line.split(" ");
            	int x = Integer.parseInt(lines[0]);
            	int y = Integer.parseInt(lines[1]);
            	if(x == 0 && y == 0)break;
            	System.out.println(y>x ? x+" "+y : y+" "+x);
            }
    }
}