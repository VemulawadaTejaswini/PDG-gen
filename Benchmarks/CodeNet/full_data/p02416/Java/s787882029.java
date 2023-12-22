import java.io.*;

class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            String line = reader.readLine();
            char tmp = line.charAt(0);
            int sum=0,i;

            while(true){
                int x = tmp - '0';
                sum += x;
                if(sum==0) break;
                else{
                    for(i=1;i<line.length();i++){
                        sum += line.charAt(i) - '0';
                    }
                    System.out.println(sum);
                }
                sum = 0;
                line = reader.readLine();
                tmp = line.charAt(0);
            }

        }catch(IOException e){
            System.out.println(e);
        }
    }
}
