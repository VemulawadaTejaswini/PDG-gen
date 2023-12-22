import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] a)throws IOException{
    	BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String str = null;
        int stackNum;
        int transNum;
        String[] transBefore;
        String[] transAfter;
        
    	while((str = in.readLine()) != null){
            if(str.equals("0")){
                System.exit(0);
            }else{
                transNum = Integer.parseInt(str);
                
                transBefore = new String[transNum];
                transAfter = new String[transNum];
                
                for(int i=0; i<transNum; i++){
                    str = in.readLine();
                    transBefore[i] = str.split(" ")[0];
                    transAfter[i] = str.split(" ")[1];                   
                }
                
                stackNum = Integer.parseInt(in.readLine());
                
                for(int i=0; i<stackNum; i++){
                    str = in.readLine();
                    for(int j=0; j<transNum; j++){
                        if(transBefore[j].equals(str)) str = transAfter[j];
                    }
                    System.out.print(str);
                }
                System.out.println();
            }
        }
    }
}