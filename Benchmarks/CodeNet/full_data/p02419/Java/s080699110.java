import java.io.*;

public class Main{

    public static void main(String[]args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        String keyword = br.readLine();
        keyword = keyword.toLowerCase();
        int count = 0;
        
        while(!(str = br.readLine()).equals("END_OF_TEXT")){
            str = str.toLowerCase();
            String[] word = str.split(" ");

            for(int i=0; i<word.length; i++){
                if(word[i].equals(keyword)){
                    count++;
                }
            }      
        }
        System.out.println(count);
    }
}