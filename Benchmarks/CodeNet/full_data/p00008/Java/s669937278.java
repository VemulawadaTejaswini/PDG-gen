import java.io.*;

public class Main{

    public static void main(String[]args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
                  
        while((str = br.readLine()) != null){
            int num = Integer.parseInt(str);
            int count = 0;

            for(int i=0; i<=9; i++){
                for(int k=0; k<=9; k++){
                    for(int w=0; w<=9; w++){
                        for(int j=0; j<=9; j++){
                            if((i+k+w+j)==num)count++;
                        }
                    }
                }
            }
            
            System.out.println(count);          
        }
    }   
}