import java.io.*;

public class Main{
    public static void main(String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            String line;
            int i = 0, j = 0, k = 0, l = 0;
            int[][] data;

            data = new int[300][2];

            while(true){
                line = reader.readLine();
                String[] tmp = line.split(" ",2);
                data[i][0] = Integer.parseInt(tmp[0]);
                data[i][1] = Integer.parseInt(tmp[1]);

                if(data[i][0] == 0 && data[i][1] == 0){
                    break;
                }
                i++;
            }
            for(j = 0; j <= i-1; j++){
                for(k = 0; k < data[j][0]; k++){
                    for(l = 0; l < data[j][1]; l++){
                        System.out.print("#");
                    }
                    System.out.print("\n");
                }
                System.out.print("\n");
            }
        }catch(NumberFormatException e){
            System.out.println(e);
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
