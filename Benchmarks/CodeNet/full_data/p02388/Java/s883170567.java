import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String num="";
		int kazu=0;
		int sannzyou=0;

		  try{
			  System.out.println("??°????????\????????????????????????");
			  num = input.readLine();
			  kazu=Integer.parseInt(num);
			  sannzyou=kazu*kazu*kazu;

			  if(kazu<1){
				  System.out.println("1???????°?????????§??????");
			  } else if(kazu>100){
				  System.out.println("100????????§????????§??????");
			  }else{
                  System.out.println(sannzyou);
                  
			  }


		    }catch(IOException e)
		    {   System.out.println("Exception : " + e);
		    }


	}

}