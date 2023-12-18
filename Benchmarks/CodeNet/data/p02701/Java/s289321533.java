

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main{

    public static void main(String[] args) {

        try {
            InputStreamReader is = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(is);
            int N= Integer.parseInt(br.readLine());
            ArrayList<String> arrayList=new ArrayList<>();
            String s;
            for(int i=0;i<N;i++){
                s = br.readLine();
                if(!arrayList.contains(s)){
                    arrayList.add(s);
                }
            }
            System.out.println(arrayList.size());
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}

