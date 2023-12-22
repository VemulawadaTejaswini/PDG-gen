import java.io.*;

public class Main{
    public static void main(String[]args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[][][] floor = new int[4][3][10];

        int count = Integer.parseInt(br.readLine());
        int[] num = new int[4];
        for(int i=0; i<count; i++){
            String[] str = br.readLine().split(" ");
            for(int k=0; k<4; k++){
                num[k] = Integer.parseInt(str[k]);
            }
            floor[num[0] -1][num[1] -1][num[2] -1] += num[3];
        }

        for(int b=0; b<4; b++){
            for(int f=0; f<3; f++){
                for(int r=0; r<10; r++){
                    if(r == 0)sb.append(" ");
                    sb.append(floor[b][f][r]);
                    if(r != 9)sb.append(" ");
                }
                sb.append("\n");
            }
            if(b<3){
                sb.append("####################").append("\n");
            }
        }
        System.out.print(sb);

    }
}