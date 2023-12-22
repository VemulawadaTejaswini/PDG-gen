import java.util.*;
import java.io.*;

class Main{
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        public static void main(String[] args) throws IOException{
                int num = Integer.parseInt(br.readLine());
                Deque<String> ar = new ArrayDeque<>(num);
                for(int i=0; i<num; i++){
                        int val;
                        String strs = br.readLine();
                        if(strs.charAt(0) == 'i')
                                ar.addFirst(strs.substring(7));
                        else if(strs.charAt(6) == 'F')
                                ar.removeFirst();
                        else if(strs.charAt(6) == 'L')
                                ar.removeLast();
                        else
                                ar.remove(strs.substring(7));
                }
                String j = ar.poll();
                while(j != null){
                        System.out.print(j);
                        j = ar.poll();
                        if(j!=null)
                                System.out.print(" ");
                }
                System.out.println();
        }
}