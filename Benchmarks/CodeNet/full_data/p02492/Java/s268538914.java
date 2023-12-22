import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Main{
        public static void main(String [] args) throws Exception{
            BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
            while(true){
                String str = br.readLine(); 
                String array[]=new String[3];
                array = str.split(" ");
                int a = Integer.parseInt(array[0]);
                int b = Integer.parseInt(array[2]);
                String o = array[1];

		if (o.equals("?")){
			break;
		}else if(o.equals("+")){
			System.out.println(a+b);

		}else if(o.equals("-")){
			System.out.println(a-b);

		}else if(o.equals("*")){
			System.out.println(a*b);

		}else if(o.equals("/")){
			System.out.println(a/b);
		}
}
}
}