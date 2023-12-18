        import java.io.*;
        import java.util.*;
        public class Main{
          public static void main(String[] args) throws IOException{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());
            int[] list = new int[a];
            String[] inp = reader.readLine().split(" ");
            int i = 0;
            for(String s: inp){
                list[i] =Integer.parseInt(s);
                i++;
            }
            Arrays.sort(list);
            int fr = Integer.MAX_VALUE;
            for(int j = list[0];j<=list[list.length-1];j++){
                int res = 0;
                for(int h=0;h<list.length;h++){
                    res=res+(list[h]-j)*(list[h]-j);
                }
                
                fr = Math.min(res,fr);
                System.out.println(res+ " " +fr);
            }
            System.out.println(fr);
              
          }}