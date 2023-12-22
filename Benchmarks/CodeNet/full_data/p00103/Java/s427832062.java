
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  
    public static void main(String[] args)  {

    	try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String line;
            while((line=br.readLine())!=null){if(line.isEmpty())break;
	        	String[] spl = line.split(" ");
	            int n = Integer.parseInt(spl[0]);
	            if(n==0){break;}
                    while(n>0){
                        int out =0, ten=0;
                        boolean rui[] =new boolean[4];
                        while(out<3){
                            line=br.readLine();
                            if(line.equals("OUT")){out++;continue;}
                            if(line.equals("HIT")){
                                if(rui[3]==true){ten++; rui[3]=false;}
                                if(rui[2]==true){rui[3]=true; rui[2] = false;}
                                if(rui[1]==true){rui[2]=true; rui[1] = false;}
                                rui[1]=true;
                            
                            }
                            if(line.equals("HOMERUN")){
                                ten++;for(int i=1;i<=3;i++){
                                    if(rui[i]==true){rui[i]=false;ten++;}
                                }
                            }
                        }
n--;
                        System.out.println(ten);
                    }//n round pass.
                    break;
            }//End WHILE


        }catch(Exception e){e.printStackTrace();}

    }


}