import java.util.*;
import java.io.*;
 
public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
String str = br.readLine();
                    String[] strs = str.split("\\s");
                    int r = Integer.parseInt(strs[0]);
                    int c = Integer.parseInt(strs[1]);
                    int[][] graph = new int[r+1][c+1];
                    int lastnum = 0;
 
                    for(int i = 0;i<r;i++){
                        str = br.readLine();
                        String[] temp = str.split("\\s");
                        int total =0;
 
                        for(int j =0;j<c;j++){
                            int tempnum = Integer.parseInt(temp[j]);
                            total += tempnum;
                            graph[i][j] = tempnum;
 
                            if(i == 0){
                                graph[r][j]= tempnum;
                            }else{
                                int tempnum2 = graph[r][j];
                                tempnum2 += tempnum;
                                graph[r][j]=tempnum2;
                            }
                        }
                        graph[i][c] = total;
                        lastnum += total;
                    }
                    br.close();
                    graph[r][c] = lastnum;
                     
                    for(int i =0;i<r+1;i++){
                        StringBuilder sb = new StringBuilder();
                        for(int j=0;j<c+1;j++){
                            String ts = String.valueOf(graph[i][j]);
                            sb.append(ts);
                            
                             if(j != c){
                            sb.append(" ");
                            }
                        }
                        System.out.println(new String(sb));
 
                    }
 
 
}
}