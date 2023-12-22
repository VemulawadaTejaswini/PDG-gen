import java.util.*;
import java.io.*;

class Main{
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        public static void main(String[] args) throws IOException{
                int num = Integer.parseInt(br.readLine());
                ArrayList<String> ar = new ArrayList<>(num);
                for(int i=0; i<num; i++){
                        int val;
                        String[] strs = br.readLine().split(" ");
                        if(strs[0].charAt(0) == 'i')
                                ar.add(0, strs[1]);
                        else if(strs[0].length() == 6)
                                ar.remove(strs[1]);
                        else if(strs[0].length() == 11)
                                ar.remove(0);
                        else
                                ar.remove(ar.size()-1);
                }
                for(int i=0; i<ar.size(); i++){
                        System.out.print(ar.get(i));
                        if(i!=ar.size()-1)
                                System.out.print(" ");
                }
                System.out.println();
        }
}