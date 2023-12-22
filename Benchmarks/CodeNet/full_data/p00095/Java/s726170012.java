
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args)  {

    	try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line;
            line=br.readLine();
            int n = Integer.parseInt(line);
            int got[] = new int[n];
            while((line=br.readLine())!=null){if(line.isEmpty())break;
	            String[] spl = line.split(" ");
	            int a = Integer.parseInt(spl[0]);
	            int b = Integer.parseInt(spl[1]);
	            got[a]+=b;
            }
            int max = -1; int bestP = -1;
            for(int i=0; i<n;i++){
            	if(got[i]>max){max = got[i];bestP=i;}
            }
            System.out.println(bestP+" "+max);


        }catch(Exception e){}

    }


}