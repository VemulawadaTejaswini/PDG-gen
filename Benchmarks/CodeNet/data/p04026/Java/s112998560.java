import java.io.*;
import java.util.*;


class Solution{
    
    void solve() throws IOException{

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String a = bufferedReader.readLine();

        HashMap<Character,List<Integer>> hashMap = new HashMap<Character,List<Integer>>();

        
        for(int i=0;i<a.length();i++){

           List<Integer> indexesList = hashMap.getOrDefault(a.charAt(i),new ArrayList<Integer>());

            indexesList.add(i);

            hashMap.put(a.charAt(i), indexesList);


            if(indexesList.size() > 1){
                int index1 = indexesList.get(indexesList.size()-2);
                int index2 = indexesList.get(indexesList.size()-1);

                if(2  > (index2-index1-1)){

                    System.out.println((index1+1) + " " + (index2+1));
                    return;
                }

            }


        }



        System.out.println("-1 -1");

    }
}

public class Main {
    public static void main(String[] args) throws IOException{
        new Solution().solve();
    }   
}