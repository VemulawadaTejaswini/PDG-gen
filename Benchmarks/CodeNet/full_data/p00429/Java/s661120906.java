import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
        public static void main(String[] args){
                try{
                        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
                        while(true){
                                String count = in.readLine();
                                if( count.equals("0") )  break;
                                String numCode = in.readLine();

try{
                                for(int i=0; i<Integer.parseInt(count); i++)
                                        numCode = zip(numCode);
                                System.out.println(numCode);
}catch(StackOverFlowError e){
e.printStackTrace();
}
                        }
                }catch(IOException e){
                        e.printStackTrace();
                }
        }

        static String zip(String numCode){
                if(numCode.length() == 0)
                        return "";

                char top = numCode.charAt(0);
                String underCode = numCode.substring(1);

                int i;
                for(i=0; i<underCode.length(); i++){
                        if(top != underCode.charAt(i))
                                break;
                }

                return (i+1) + String.valueOf(top) +
                        zip(underCode.substring(i));
        }
}